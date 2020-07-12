package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Company;
import project.CarRental.model.entity.Department;
import project.CarRental.model.mappers.DepartmentMapper;
import project.CarRental.model.repository.CompanyRepository;
import project.CarRental.model.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository, DepartmentRepository departmentRepository) {
        this.companyRepository = companyRepository;
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentDto> getAllDepartment() {
        Iterable<Department> departmentsList = departmentRepository.findAll();
        ArrayList<DepartmentDto> result = new ArrayList<>();
        for(Department department : departmentsList) {
            result.add(DepartmentMapper.INSTANCE.departmentToDto(department));
        }
        return result;
    }



}
