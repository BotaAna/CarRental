package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.CarRental.model.dto.DepartmentDto;
import project.CarRental.model.entity.Department;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.CompanyDto;
import project.CarRental.service.CompanyService;

import java.util.List;
import java.util.Set;

import java.util.List;

@Controller
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    public String companies(Model model) {
        List<CompanyDto> companies = companyService.getAllCompanies();
        model.addAttribute("companiesList", companies);
        return "companies";
    }

    @GetMapping("/addCompany")
    public String addCompanyForm() {
        return "addCompany";
    }

    @PostMapping("/addCompany")
    public String addCompany(CompanyDto companyDto) {
        companyService.saveCompany(companyDto);
        return "redirect:/companies";
    }

    @GetMapping("/editCompany")
    public String editCompany(Model model, @RequestParam("id") Integer id) {
        CompanyDto companyDto = companyService.getCompanyById(id);
        model.addAttribute("company", companyDto);
        return "editCompany";
    }

    @PostMapping("/editCompany")
    public String saveEditedCompany(CompanyDto companyDto) {
        companyService.saveCompany(companyDto);
        return "redirect:/companies";
    }

    @GetMapping("/deleteCompany")
    public String deleteCompany(@RequestParam("id") Integer id) {
        companyService.deleteCompanyById(id);
        return "redirect:/companies";
    }

}
