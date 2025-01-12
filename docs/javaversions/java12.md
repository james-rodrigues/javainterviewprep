# Java 12 features

## Compact Number Format
* NumberFormat class has new method called getCompactNumber which takes in a locale and format type(short or Long)
* It can be used to display large numbers on the UI
* Rounding off and decimal digits can also be placed on formatting

## Comparing 2 files
* The Files now has a mismatch method that helps comparing the contents of the 2 files
* -1 is returned when files are identical
* The first mismatch position is returned If there are differences but file size is the same or the smaller file size is returned if the contents match but file size is different

## JMH ( Java Microbenchmark Harness)
* Library for developing performance benchmarks
* De-facto standard for benchmarks
* Current microbenchmarking doesn’t take into account JVM warm-up, Hotspot compilation and code optimisations when using System.currentTimeMillis() or System.nanoTime()
* @Benchmark annotation will be used to benchmark a particular method
* We can control the various parameters like no. of VMS, Iterations, params etc when benchmarking
* Should be used for performance critical areas, general purpose library and latency sensitive code as it can produce accurate results.

## Shenandoah GC
* Low Pause Time GC
* Developed by RedHat
* Responsive application with shirt pause time
* Concurrent marking and compacting
* Not enabled by default, need to enable by VM Options
* Can achieve concurrent relocation while application is running
* Uses forwarding/brooks pointer to new location when object is being relocated

## Teeing Collector
* Teeing means merging the results of two collectors
* We can combine the results of stream taking two separate parameters into one object or list to have a result

## Switch Expressions
* Switch Expression were introduced as a preview feature in Java 12 and 13
* We need to enable the —enable-preview flag to have it enabled for compilation and run
* This included using lambda syntax to make the switch expression more readable

## String API updates
* Indent function was added to the String class to indent the string provided with the number of spaces provided as argument
* Transform function takes a Function as an argument to transform the string value by a user defined or existing function
* Offers more readability and we can use lambda expression or method reference in the transform function
