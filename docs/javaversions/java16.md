# Java 16 features

## Records
* We can override the constructors and toString method of the record class
* We can use other objects like Map to populate the record object via constructors
* A record is final and immutable
* Record can be used to be create a compound key of non related objects in a Map
* Generics can be used with Records
* Use cases :
    * Data transfer objects
    * Multiple return values
    * Stream operations
    * Compound map keys
* Non use case :(due to being final and immutable)
    * JPA Entity
    * JavaBeans

## Stream API changes
* mapMulti - Can be used in places of Flatmap
* It helps reduce an additional stream created during flatMap
* We need to use generics with mapMulti or specify the type of the arguments
* toList method can be used in place of.collect(Collectors.toList())
* This creates an unmodifiable list.
* toSet and toMap not available

## Pattern matching for instanceOf
* Standard feature now in Java 16
* Testing and casting done in the same operation
* Scope of the local variable depends on the control flow
* Pattern matching will be used in switch expressions, arrays, records and sealed classes

## Sealed types & Records together
* Sealed keyword can be used with interfaces and classes
* Record can implement or extend sealed classes or interfaces
* If subclasses are not in the same java file, then we need to use permits keyword otherwise not

Strongly encapsulate JDK internals by default
* —illegal-access flag was provided from JDK 8-15 to access internal JDK classes. Default value that time was permit
* Now in Java 16, it has been set to deny by default, but we can override the value using the flag during run
* Java encourages to using Standard APIs instead of the internal JDK implementations
* Use Jeeps tool to identify the relevant dependencies
* This flag might be removed in the future

Packaging Java applications
* jpackage is a packaging tool to package self contained java application.
* We can multiple jars bundled together
* Platform specific (OS)
* Command : jpackage —name myapp —input lib —main-jar main.jar —type dmg
* Supported packaging:
    * Windows : msi & exe
    * Linux : deb & rpm
    * macOS : pkg & dmg
* Creates a installable package for your java applications
* Required : Wix toolset

Warnings for Value Based Classes
* Constructor of Wrapper classes have been deprecated
* Project Valhalla
* Value Types or Inline Types
* Wrapper classes might become primitive classes to boost performance

