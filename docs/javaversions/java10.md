# Java 10 Features

## Local Variable Type Inference
* Local variable type inference means the type of the variable is determined by the compiler automatically based on the value or expression
* Var keyword can be used in variable initialisation, index in for loop and try with resources
* Var keyword cannot be used field declaration, method arguments & return types, catch blocks and constructor arguments
* Var is a reserved keyword and cannot be used as a variable name
* Var variables once defined with a value cannot change the valueType
* Var variables are non final by default, use final to make it a constant.
* Question to ask when using var keyword : Does this code improve my code readability ? Will variables names help identify the data contained in the variable ?

## orElseThrow in Optional
1. When using Optional, use orElseThrow() method to get the value or through an exception if in case the value is null
2. Optional.get() will be deprecated in the future as it requires a combination of if else and use of isPresent() method reducing readability.


## Creating Unmodifiable Collections
1. List.copyOf method can be used to create a immutable list from the list provided as an argument
2. Any changes to the argument list will not be reflected in the copied list


## Application Class-Data Sharing
1. Free feature starting JDK 10
2. Creates a shared memory archive area for all meatspace data across JVMs
3. It Helps improve startup time and reduce memory footprint
4. Java -Xshare:on - Activates CDS(Class Data Sharing)
5. Archive file is stored in a file with extension .jsa
6. All classes required by your app can be listed in a file with extension .lst
7. Benefits
    1. Space saving
    2. Significant start up time
    3. Future enhancements
    4. Overall cost savings


## Improved Container Awareness
1. JVM not recognises if its running in a container
2. Its adjusts its memory according to the container size
3. You can control the memory allocated to JVM in the container using the XX parameters
