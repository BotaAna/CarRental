package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.entity.Car;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToDto(Car car);
    Car dtoToCar(CarDto carDto);

}
