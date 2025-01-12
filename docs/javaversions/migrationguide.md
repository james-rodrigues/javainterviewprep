# Java Migration Tips

## Build Tools and Plugins
* Update maven compiler plugin with the right release tag
* Maven surefire plugin and maven failsafe plugin also needs to be upgraded
* Update IDE to support new java version

## JAXB Problem & Solution
* JAXB as been separated from Java bundle
* We need to add maven dependencies to continue using JAXB, take latest stable version
* Update the imports as well

## Hibernate compatibility
* Check for the compatibility of hibernate jar versions on the official website
* Check if any relevant libraries are missing

## Spring & Spring Boot compatibility
* Update Java version
* Update the spring boot version
