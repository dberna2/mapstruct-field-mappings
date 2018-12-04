package com.example.mapstruct.mapper;


import com.example.mapstruct.dto.CarDTO;
import com.example.mapstruct.entity.Car;
import com.example.mapstruct.entity.Document;
import com.example.mapstruct.entity.Person;
import org.junit.Test;

import java.time.Instant;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CarMapperTest {

    @Test
    public void mapCarToCarDto() {

        Document document = new Document();
        document.setType("CC");
        document.setNumber("1234567654");

        Person person = new Person();
        person.setId(1);
        person.setFullName("Camilo Romero");
        person.setBirthdayDate(Date.from(Instant.EPOCH));
        person.setPhoneNumber("12345");
        person.setDocument(document);

        Car car = new Car();
        car.setColor("Blue");
        car.setMake("Tesla");
        car.setIgnoreField(true);
        car.setPerson(person);

        CarDTO carDto = CarMapper.INSTANCE.mapCarToCarDto(car);

        assertThat(carDto).isNotNull();
        assertThat(carDto.getColor()).isEqualTo(car.getColor());
        assertThat(carDto.getMake()).isEqualTo(car.getMake());
        assertThat(carDto.getFieldToIgnore()).isNull();
        assertThat(carDto.getPerson()).isNotNull();
        assertThat(carDto.getPerson().getId()).isEqualTo(car.getPerson().getId());
        assertThat(carDto.getPerson().getName()).isEqualTo(car.getPerson().getFullName());
        assertThat(carDto.getPerson().getBirthday()).isEqualTo(car.getPerson().getBirthdayDate());
        assertThat(carDto.getPerson().getPhoneNumber()).isEqualTo(car.getPerson().getPhoneNumber());
        assertThat(carDto.getPerson().getDocument()).isNotNull();
        assertThat(carDto.getPerson().getDocument().getType()).isEqualTo(car.getPerson().getDocument().getType());
        assertThat(carDto.getPerson().getDocument().getNumber()).isEqualTo(car.getPerson().getDocument().getNumber());
    }
}
