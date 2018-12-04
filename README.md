 # mapstruct-field-mappings

MapStruct is a code generator that simplifies the implementation of mappings between java objects.
The great virtue of this code generator, is to generate the mapping code in time of complication and not of execution since as we know the use of reflection as it uses
dozzer or orikaMapper is something expensive to do and more if it is done again and again once for each mapping that is needed. Having the code already generated these tasks will be much faster.
I took a look at the code that it generates and it did not seem at all bad to me the way it does, since the manuel way that is done as a developer is very similar

 ![CustomerDtoDefintion](images/PersonToPersonDTO.png?raw=true "PersonToPersonDTO definition")
 
 ![CustomerDtoDefintion](images/DocumentToDocumentDTO.png?raw=true "DocumentToDocumentDTO definition")
 
 ![CustomerDtoDefintion](images/CarListToCarDTOList.png?raw=true "CarListToCarDTOList definition")


 # Requisitos 
 - [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-3848520.html).
 - [Meven 3.X](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-3848520.html).
 - [mapstruct](https://plugins.jetbrains.com/plugin/6317-lombok-plugin).

 # Class diagram

 ![CustomerDtoDefintion](images/DiagramDTO.png?raw=true "Diagram DTO definition")

 
 # Car mapper example
 
 - Automatic mapping attributes with same name and type
 - Mapping attributes with same type and different name: ignoreField->fieldToIgnore (You only have to declare in CarMapper)
 - Ignore property wont be mapped (ignore=true)
 - @DecoratedWith(CarMapperDecorator.class) will allow to overwrite any value.
 
 ![CustomerDtoDefintion](images/CarConverter.png?raw=true "CarConverter definition")
 
 ![CustomerDtoDefintion](images/CarDecorator.png?raw=true "CarDecorator definition")
 - Note: In this case I only change the person name.

 
 ![CustomerDtoDefintion](images/CarMapper.png?raw=true "CarMapperDTO definition")
 
 -InheritInverseConfiguration In this last image we see the notation InheritInverseConfiguration, in this case the
I use to create the same configuration of CarDTO to Car or Car to CarDTO

