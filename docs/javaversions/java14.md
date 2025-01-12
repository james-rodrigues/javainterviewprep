# Java 14 Features

## Switch Expressions
* Official Feature in Java 14
* Multiple cases combined with comma
* Arrow instead of a colon
* No break between cases
* Default case should return value or throw exception
* Improves Readability and returns a single value
* Scope of local variable is only till the case condition
* Yield keyword is used to return a value(after seeking feedback)
* We can use the old style and new style interchangeably

## Helpful NullPointerExceptions
* Describes precisely which variable was null
* Helpful information for debugging
* Need to enable using VM Options
* Might add performance and security issues

## Garbage Collection Improvements
* NUMA-Aware Memory Allocation for G1
* Deleted Concurrent CMS Collector
* G1 is the default GC now
* ZGC is now available on Windows and macOS

## Records
* Lean Data carrier class
* Immutable
* Easy, clear and concise
* Preview feature in Java 14
* Helps provide getters, setters, equals, hashcode and constructors

## Pattern matching for instanceOf
* Testing using instanceOf and casting to a variable is done in the same statement
* Preview feature in Java 14
* Example : object instanceOf String result
