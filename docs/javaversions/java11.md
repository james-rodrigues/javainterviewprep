# Java 11 Features

## HTTP Client API
* Motivation for HttpClient API
    * Cumbersome and outdated HTTP API supporting only HTTP1.1
    * Had to use other third party API for HTTP calls
* Supports HTTP1.1, HTTP2 and Websocket
* Supports both synchronous and asynchronous connection
* It is a compact API using builder pattern
* It uses Reactive Streams behind the scenes

## Local Variable Syntax For Lambda parameters
* Var keyword can be used for lambda parameters
* Annotation can be used on lambda variables with this like @NonNull
* If lambda expression has multiple parameters, if one parameter is declared with var keyword, the other parameters need to be declared as well

## String API changes
* Repeat method can be used to repeat a string based on the count provided
* repeat(0) returns an empty string
* IsBlank is used to check is it is an empty or blank whitespace string
* Trim method removes space before and after the string but works with an older Unicode character set
* strip(), stripLeading() and stripTrailing() are new improved methods for trim functionality
* lines() method is used to give a single string from a multiple lines separated by /n or /r. This method returns a stream making it a lazy initialization

## Deprecations and Removals

## Single-File Source Code Programs
* Scripting with Java
* Automation
* Works with shebang operator #!/usr/bin/java —source <java_version>
* Requirements :
    * Single file source with a main method
    * Path to java Installation
    * Do not give an extension as .java
    * Command to run : ./filename .
      Garbage Collection - Epsilon and ZGC
      New APIs - File and Predicate
* readString - to read file contents into a string. Cannot read file greater than 2MB
* writeString - to write file with a given string
* Not function is available in Predicate to negate a condition. It is a static method in Predicate interface, negate is a default method

## Flight Recorder(JFR)
* Profiling and Diagnostic tool
* Event recorder
* Records in form of binary file
* Extremely low overhead
* jcmd to run flight recorder in production

## Mission Control (JMC)
* Tool Suite
* Independent tool
* Graphical Front end
* Real time JVM Monitoring
* Can connect to running JVMs
* Helpful to read .jfr files(recordings)
