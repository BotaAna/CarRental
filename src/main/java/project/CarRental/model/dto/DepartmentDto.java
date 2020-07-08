package project.CarRental.model.dto;

import java.util.Collections;
import java.util.List;

public class DepartmentDto {

    private Integer id;
    private String depAddress;
    //private List<EmployeeDto> depEmployees = Collections.emptyList();
    //private List<CarDto> depCars = Collections.emptyList();


    public DepartmentDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }
}
