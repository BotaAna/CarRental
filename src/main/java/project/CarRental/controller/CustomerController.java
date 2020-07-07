package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.CustomerService;

@Controller
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
}
