package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.CustomerDto;
import project.CarRental.model.entity.Customer;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto customerToDto(Customer customer);
    Customer dtoToCustomer(CustomerDto customerDto);

}
