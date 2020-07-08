package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.EmployeeDto;
import project.CarRental.model.entity.Employee;
import project.CarRental.model.mappers.EmployeeMapper;
import project.CarRental.model.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDto> getAllEmployees() {
        Iterable<Employee> employeesList = employeeRepository.findAll();
        ArrayList<EmployeeDto> result = new ArrayList<>();
        for(Employee employee : employeesList) {
            result.add(EmployeeMapper.INSTANCE.employeeToDto(employee));
        }
        return result;
    }

    public EmployeeDto getEmployeeById(Integer id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            return EmployeeMapper.INSTANCE.employeeToDto(employee.get());
        }
        return null;
    }

    public void saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.INSTANCE.dtoToEmployee(employeeDto);
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
    }

}
