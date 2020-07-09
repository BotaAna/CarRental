package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.ReturnCarDto;
import project.CarRental.model.entity.ReturnCar;

@Mapper
public interface ReturnCarMapper {

    ReturnCarMapper INSTANCE = Mappers.getMapper(ReturnCarMapper.class);

    ReturnCarDto returnCarToDto(ReturnCar returnCar);
    ReturnCar dtoToReturnCar(ReturnCarDto returnCarDto);

}
