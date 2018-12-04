package com.example.mapstruct.decorator;

import com.example.mapstruct.dto.CarDTO;
import com.example.mapstruct.entity.Car;
import com.example.mapstruct.mapper.CarMapper;

public abstract class CarMapperDecorator implements CarMapper{

    private final CarMapper delegate;

    protected CarMapperDecorator(CarMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public CarDTO mapCarToCarDto(Car car) {
        CarDTO carDTO = delegate.mapCarToCarDto(car);

        //An example to decorate the bean
        carDTO.getPerson().setName(car.getPerson().getFullName());

        System.out.println("mapper decorator to : " + carDTO.getMake());
        return carDTO;
    }
}
