package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentalCarMapper {

    RentalCarMapper INSTANCE = Mappers.getMapper(RentalCarMapper.class);
}
