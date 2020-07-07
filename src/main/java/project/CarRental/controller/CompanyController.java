package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.CompanyService;

@Controller
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
}
