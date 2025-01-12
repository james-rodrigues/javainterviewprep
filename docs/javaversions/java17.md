# Java 17 features

## Sealed classes and interfaces
* Standard feature in JDK 17
```Java
  interface I {}

sealed class C permits D {}

final class D extends C {}

if (c instanceOf I) { ... } // Not Allowed, compilation issues
---------------------------------------------------------------

interface I {}

sealed class C permits D, E {}

non-sealed class D extends C {} // possible to implement interface I

final class E extends C {}

if (c instanceOf I) { ... } // Allowed, no compilation issues
```

## Strongly encapsulated JDK internals
* —illegal-access flag has been removed

## Removals and Deprecations
### Deprecations
* Security Manager
* Applet API
  Removals
* RMI Activation

## Pattern matching for switch
* Pattern matching now allowed in switch expressions
* We can add multiple condition in case condition
* Add more specific condition before the generic ones
* Null case is allowed in switch case
* In Maven specify the —enable-preview flag in the compilerArgs of the maven compiler
* We can use the same flag in command line arguments
* Switch can take in input of any type of Object
