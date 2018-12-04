package com.example.mapstruct.converter;

import com.example.mapstruct.entity.Person;

public class CarConverter {


    public String asString(Person person) {
        return person!=null && person.getFullName() != null && person.getId()!=null  ? person.toString() : null;
    }


    public Person asBrake(String brake) {
        Person person = new Person();
        person.setFullName(brake != null? brake.toString() : null);
        return person;
    }
}
