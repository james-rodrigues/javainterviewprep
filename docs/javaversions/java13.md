# Java 13 Features

## ReImplement the legacy Socket API
* Old Socket Api replaced with NIOSocketImpl
* Easy to maintain and debug
* Created in accordance with Project Loom
* Old Implementation has not been removed and can be enabled via VM Options

## Dynamic CDS Archive
* Java 13 now enables to create archive files on exit on a running java application
* Only on successful exit the archive file is created
* It now supports Built-in class loaders and user-defined class loaders
* Simplify and enhance AppCDS usage

## Text Blocks
* Preview feature in Java 13
* It can be used to represent multiple line strings literals
* Enhances readability and clarity
* Text blocks uses “”” your string “””

## String API Changes
* stripIndent - Preview feature in Java 13
* Used to indent string and avoid incidental whitespace, can work with text blocks
* translateEscapes in String class helps maintain the escapes sequences present in a string like \”, “t etc
* String.formatted method can be invoke directly on the string and replace %s interpolated string in the provided string
* All 3 features are to be used with text blocks in the future, hence it is going to be deprecated from String class

## Switch Expressions
* Still Available as preview feature
* Yield keyword was used to return a value

## ZGC Enhancements
* Unused memory returned to the OS
* Uncommit by default
* Performance Improvement 
