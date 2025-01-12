## Java 15 features

## Text Blocks
* Standard feature in java 15
* All String operations possible on text blocks
* New line character is added to text block string if ending delimiter “”” present on another line
* Text block does not include the incidental whitespace
* \ - escape sequence to avoid adding a new line escape sequence
* \s - space characters to maintain the space added in the text block literal
* Compile Time processing of Text Blocks
    * Normalisation of line terminators
    * Handling of whitespace
    * Handling escape sequences

## Helpful NullPointerExceptions
* Enabled by Default now
* Can be disabled by VM Options

## Records
* Preview feature in Java 15
* Record can be created locally in a methods promoting encapsulation
* This feature is called local records
* It is implicitly static

## Sealed Classes and Interfaces
* Sealed classes are used to restrict the extensibility of a class
* Syntax : <access modifier> sealed class <classname> permits <subclassnames>
* Subclasses can be final or non-sealed as well
* Benefits :
    * Control implementation
    * Create secure hierarchies
    * Domain Modeling
    * Better type checking
* Use for Platform libraries

## GC changes, Deprecations and Removals
* ZGC and Shenandoah GC - Permanent feature that can be activated in VM options
* Deprecations :
    * Nashorn Javascript engine/JJS tool
    * RMI static stub compiler(mic)
    * RMI activation
