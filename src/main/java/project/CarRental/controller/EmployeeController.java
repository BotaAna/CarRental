package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.EmployeeService;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
