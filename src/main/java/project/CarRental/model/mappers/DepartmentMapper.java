package project.CarRental.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Department;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDto departmentToDto(Department department);
    Department dtoToDepartment(DepartmentDto departmentDto);

    List<DepartmentDto> departmentListToDto(List<Department> department);
    List<Department> dtoToDepartmentList(List<DepartmentDto> departmentDto);

}
