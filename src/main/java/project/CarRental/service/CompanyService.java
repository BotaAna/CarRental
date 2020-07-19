package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Company;
import project.CarRental.model.entity.Department;
import project.CarRental.model.mappers.DepartmentMapper;
import project.CarRental.model.dto.CompanyDto;
import project.CarRental.model.entity.Company;
import project.CarRental.model.mappers.CompanyMapper;
import project.CarRental.model.repository.CompanyRepository;
import project.CarRental.model.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<CompanyDto> getAllCompanies() {
        Iterable<Company> companiesList = companyRepository.findAll();
        ArrayList<CompanyDto> result = new ArrayList<>();
        for(Company company : companiesList) {
            result.add(CompanyMapper.INSTANCE.companyToDto(company));
        }
        return result;
    }

    public CompanyDto getCompanyById(Integer id) {
        Optional<Company> company = companyRepository.findById(id);
        if(company.isPresent()) {
            return CompanyMapper.INSTANCE.companyToDto(company.get());
        }
        return null;
    }

    public void saveCompany(CompanyDto companyDto) {
        Company company = CompanyMapper.INSTANCE.dtoToCompany(companyDto);
        companyRepository.save(company);
    }

    public void deleteCompanyById(Integer id) {
        companyRepository.deleteById(id);
    }

}
