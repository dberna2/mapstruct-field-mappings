package com.example.mapstruct.dto;

public class CarDTO {

    private String make;
    private String color;
    private Boolean fieldToIgnore;
    private PersonDTO person;

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

    public Boolean getFieldToIgnore() {
        return fieldToIgnore;
    }

    public void setFieldToIgnore(Boolean fieldToIgnore) {
        this.fieldToIgnore = fieldToIgnore;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }
}
