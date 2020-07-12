package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Department;
import project.CarRental.service.CompanyService;

import java.util.List;
import java.util.Set;

@Controller
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public String company(Model model) {
        List<DepartmentDto> departmentsList = companyService.getAllDepartment();
        model.addAttribute("departmentsList", departmentsList);
        return "company";
    }


}
