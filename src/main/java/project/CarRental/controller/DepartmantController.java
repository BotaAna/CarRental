package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.DepartmentService;

@Controller
public class DepartmantController {

    private DepartmentService departmentService;

    public DepartmantController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}
