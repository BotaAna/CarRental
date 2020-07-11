package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Department;
import project.CarRental.model.mappers.DepartmentMapper;
import project.CarRental.model.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
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

    public DepartmentDto getDepartmentById(Integer id) {
        Optional<Department> department = departmentRepository.findById(id);
        if(department.isPresent()) {
            return DepartmentMapper.INSTANCE.departmentToDto(department.get());
        }
        return null;
    }

    public void saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.INSTANCE.dtoToDepartment(departmentDto);
        departmentRepository.save(department);
    }

    public void deleteDepartmentById(Integer id) {
        departmentRepository.deleteById(id);
    }
}
