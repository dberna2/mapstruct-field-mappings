package com.example.mapstruct.mapper;

import com.example.mapstruct.converter.CarConverter;
import com.example.mapstruct.decorator.CarMapperDecorator;
import com.example.mapstruct.dto.CarDTO;
import com.example.mapstruct.entity.Car;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CarConverter.class)
@DecoratedWith(CarMapperDecorator.class)
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "ignoreField", target = "fieldToIgnore", ignore = true),
            @Mapping(source = "person.birthdayDate", target = "person.birthday", dateFormat = "dd.MM.yyyy")
    })

    @InheritInverseConfiguration
    CarDTO mapCarToCarDto(Car car);
}
