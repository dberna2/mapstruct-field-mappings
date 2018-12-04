package com.example.mapstruct.entity;

public class Car {

    private String make;
    private String color;
    private Boolean ignoreField;
    private Person person;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIgnoreField() {
        return ignoreField;
    }

    public void setIgnoreField(Boolean ignoreField) {
        this.ignoreField = ignoreField;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
