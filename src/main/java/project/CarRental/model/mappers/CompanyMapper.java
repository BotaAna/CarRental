package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.dto.CompanyDto;
import project.CarRental.model.entity.Car;
import project.CarRental.model.entity.Company;

import java.util.List;

@Mapper
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDto companyToDto(Company company);
    Company dtoToCompany(CompanyDto CompanyDto);

    List<CompanyDto> companyListToDto(List<Company> company);
    List<Company> dtoToCompanyList(List<CompanyDto> companyDto);

    List<CompanyDto> companyIterableToDto(Iterable<Company> company);
    List<Company> dtoIterableToCompany(Iterable<CompanyDto> companyDto);


}
