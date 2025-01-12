# Java 9 Features

## Collection Factory Methods
1. List.of method create a unmodifiable list. Same is for Set and Map
2. Add or remove actions are not allowed once collection is created (UnsupportedOperationException)
3. Null values is not allowed in List.of method (NullPointerException)
4. Duplicates in Set and Duplicate Key in Map is also not allowed

### Advantages
1. Provides a no changeable list for client to consumer
2. Provides thread safety as we know what values it will contain
3. Provides space efficiency avoiding extra objects creation using normal creation of the same collection thus improving performance

### Facts :
1. Collections.unmodifiableList provides a immutable view of the underlying list supplied, if elements are added or removed in the underlying list, the immutable list will reflect the latest data irrespective of where it it has been declared in the program.
2. Collection.unmodifiable list allows null value

## G1 Garbage collector
1. Default GC starting Java 9
2. Heap is split into multiple regions(Eden, Survivor, Old or Humongous)
3. Low Latency and Throughput
4. Pause target of 200 ms
5. Objects move from Eden -> Survivor -> Old -> Humongous(Covering half region size)
6. Concurrent mark operation is done when fetching live objects in old region

## Compact Strings
1. String representation in the memory was changed from char[] to byte[]
2. Coder field is added in String class, if memory allocated after string compression is 1 byte(most of the cases), value is LATIN1 else it will be UTF16

### Advantages
1. Improves space efficiency reducing memory footprint
2. Less pressure on GC process
3. Performance gain

## String Concatenation
1. String Concatenation was replaced using Dynamic Invoke of the Bytecode at runtime rather than using multiple StringBuilder append calls
2. Lazy Initialisation at runtime rather than at compile time

## Module System
1. Problems with JAR Hell
    1. NoClassDefFoundError
    2. Shadowing classes between jars
    3. Weak Encapsulation
2. Module is a name for self describing collection of code and data
3. Module System was introduced to Make Java modular and avoid using functionality that is not required from rt.jar
4. We can make our applications modular as well but its optional
5. We can now have modular apps and modular tools
6. Module-info.java specifies the packages that are exported and the packages it requires for functioning
7. Module-info.java is provided at the root of src/main/java
8. When your modular app requires a java module, it needs to be specified in module-info.java, else it will lead in compilation error
9. If an application is non modular and JDK is modular starting JDK 9, If module information is fetched, it will return a unnamed module
10. Named modules are called as explicit modules
11. Automatic Modules(middle ground between named and unnamed Modules) are created based on the name of the jar file used for execution.
12. Automatic Modules in easier migration from previous java versions
13. Automatic Modules also help in working with third party libraries that are not modular or on lower versions of Java
14. Unnamed and Automatic Modules requires and exports all packages

### Advantages :
1. Reliable configuration - JVM fetches all required modules at launch time rather than at runtime and fails fast
2. Strong encapsulation - Only Export what is required
3. Increased security and Maintainability - critical code is hidden
4. Scalable Platform - we can use only a subset of the JDK required for our apps

## JDeps Tool
1. Commands to use to find any JDK Internal classes have been used :
   jdeps -jdkinternals ClassName.class
2. To explicitly add a non exported module : javac/java —add-exports java.base/sun.security.x509=ALL-UNNAMED ClassName.java
   where sun.security.x509 is an example of non exported class

## Jlink Tool
1. Jlink is tool that is used to create images of the application with only the modules required by the application and nothing more
2. It is Optional
3. It helps reduce the size with only the required modules included and helps improve the start up time
4. It doesn’t support automatic modules
5. It is platform specific and is plugin based
6. Command : link —module-path mods —add-modules <modules to be added> —output <output folder name>

## Jshell Tool
1. Interactive tool (REPL), not an IDE
2. Used for new language features, prototyping, handy for new programmers
3. Command to start: jshell
4. Supports code completion
5. We cannot add a package declaration in shell, we can do rest of the other things
6. Some commands : /list, /save, /open, /help, /drop, /vars, /exit

## Private Methods in Interface
1. Allows to add private methods in an interface, not accessible by any class
2. Can be static or instance type
3. Only accessible within the interface in default and static methods

## Stream API enhancements
1. takeWhile method similar to limit method but its accepts a predicate as an argument. If condition is satisfied, it breaks from the stream
2. dropWhile method similar to skip method but its accepts a predicate as an argument. If condition is satisfied, it breaks from the stream
3. Both methods can be used in place of filter if data has to be short circuited
4. Iterate method in stream has been added with a predicate condition. You can now specify a condition as a second argument as to when the stream should stop processing.
5. Stream.OfNullable provides the value in present else returns an empty stream

## Deprecated Annotations
1. @Deprecated(forRemoval= true)
2. @Deprecated(since=<version>)
3. @deprecated java annotation tag
4. Command to check deprecated functions : jdeprscan - jdeprscan [options] {dir|jar|class}



