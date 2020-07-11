package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.service.DepartmentService;

import java.util.List;

@Controller
public class DepartmantController {

    private DepartmentService departmentService;

    public DepartmantController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public String departments(Model model) {
        List<DepartmentDto> departments = departmentService.getAllDepartments();
        model.addAttribute("departmentsList", departments);
        return "departments";
    }

    @GetMapping("/addDepartment")
    public String addDepartmentForm() {
        return "addDepartment";
    }

    @PostMapping("/addDepartment")
    public String addDepartment(DepartmentDto departmentDto) {
        departmentService.saveDepartment(departmentDto);
        return "redirect:/departments";
    }

    @GetMapping("/editDepartment")
    public String editDepartment(Model model, @RequestParam("id") Integer id) {
        DepartmentDto departmentDto = departmentService.getDepartmentById(id);
        model.addAttribute("department", departmentDto);
        return "editDepartment";
    }

    @PostMapping("/editDepartment")
    public String saveEditedDepartment(DepartmentDto departmentDto) {
        departmentService.saveDepartment(departmentDto);
        return "redirect:/departments";
    }

    @GetMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam("id") Integer id) {
        departmentService.deleteDepartmentById(id);
        return "redirect:/departments";
    }

}
