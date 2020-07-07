package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.EmployeeDto;
import project.CarRental.model.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDto employeeToDto(Employee employee);
    Employee dtoToEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> employeeListToDto(List<Employee> employee);
    List<Employee> dtoToEmployeeList(List<EmployeeDto> employeeDto);

}
