 # mapstruct-field-mappings
 MapStruct es un generador de codigo que simplifica la implementacion de mapeos entre objetos java. 
 La gran virtud de este generador de codigo, es que generan en tiempo de complicación. Esto es de gran utilidad, ya que no usa reflexion como lo hace orikamapper o dozzer siendo asi mas rapida la ejecucion del codigo


 ##Requisitos 
 - [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-3848520.html).
 - [Meven 3.X](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-3848520.html).
 - [mapstruct](https://plugins.jetbrains.com/plugin/6317-lombok-plugin).

 ##Class diagram

 ![CustomerDtoDefintion](images/DiagramDTO.png?raw=true "Diagram DTO definition")

 
 ##Car mapper example
 
 - Automatic mapping atributes with same name and type (ignoreProperty,surname, make)
 - Custom converter Brake<->String. Property brake-> brakeName (@Mapper(uses = {CarConverters.class}))
 - Mapping atributes with same type and different name: numberOfSeats->seatCount (You only have to declare in CarMapper)
 - Ignore property wont be mapped (ignore=true)
 - @DecoratedWith(CarMapperDecorator.class) will allow to overwrite any value.
 
 ![CustomerDtoDefintion](images/CarConverter.png?raw=true "CarConverter definition")
 
 ![CustomerDtoDefintion](images/CarDecorator.png?raw=true "CarDecorator definition")
 #####Note: In this case I only change the person name.

 
 ![CustomerDtoDefintion](images/CarMapper.png?raw=true "CarMapperDTO definition")
 
-InheritInverseConfiguration In this last image we see the notation InheritInverseConfiguration, in this case the
I use to create the same configuration of CarDTO to Car or Car to CarDTO

