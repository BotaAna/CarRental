package project.CarRental.model.dto;

import java.util.Collections;
import java.util.List;

public class DepartmentDto {

    private String depAddress;
    //private List<EmployeeDto> depEmployees = Collections.emptyList();
    //private List<CarDto> depCars = Collections.emptyList();


    public DepartmentDto() {
    }

    public String getDepAddress() {
        return depAddress;
    }

    public void setDepAddress(String depAddress) {
        this.depAddress = depAddress;
    }
}
