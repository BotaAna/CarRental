package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.entity.Car;

import java.util.List;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToDto(Car car);
    Car dtoToCar(CarDto carDto);

    List<CarDto> carListToDto(List<Car> car);
    List<Car> dtoToCarList(List<CarDto> carDto);

    List<CarDto> carIterableToDto(Iterable<Car> car);
    List<Car> dtoIterableToCar(Iterable<CarDto> carDto);




}
