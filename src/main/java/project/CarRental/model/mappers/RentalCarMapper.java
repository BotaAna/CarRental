package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.RentalCarDto;
import project.CarRental.model.entity.RentalCar;

import java.util.List;

@Mapper
public interface RentalCarMapper {

    RentalCarMapper INSTANCE = Mappers.getMapper(RentalCarMapper.class);

    RentalCarDto rentalCarToDto(RentalCar rentalCar);
    RentalCar dtoToRentalCar(RentalCarDto rentalCarDto);

    List<RentalCarDto> rentalCarListToDto(List<RentalCar> rentalCar);
    List<RentalCar> dtoToRentalCarList(List<RentalCarDto> rentalCarDto);

    List<RentalCarDto> rentalCarIterableToDto(Iterable<RentalCar> rentalCar);
    List<RentalCar> dtoIterableToRentalCar(Iterable<RentalCarDto> rentalCarDto);
}
