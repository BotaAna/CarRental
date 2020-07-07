package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.CompanyDto;
import project.CarRental.model.entity.Company;

@Mapper
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDto companyToDto(Company company);
    Company dtoToCompany(CompanyDto CompanyDto);


}
