package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.CustomerDto;
import project.CarRental.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public String customers(Model model) {
        List<CustomerDto> customers = customerService.getAllCustomers();
        model.addAttribute("customersList", customers);
        return "customers";
    }

    @GetMapping("/addCustomer")
    public String addCustomerForm() {
        return "addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(CustomerDto customerDto) {
        customerService.saveCustomer(customerDto);
        return "redirect:/customers";
    }

    @GetMapping("/editCustomer")
    public String editCustomer(Model model, @RequestParam("id") Integer id) {
        CustomerDto customerDto = customerService.getCustomerById(id);
        model.addAttribute("customer", customerDto);
        return "editCustomer";
    }

    @PostMapping("/customerCar")
    public String saveEditedCustomer(CustomerDto customerDto) {
        customerService.saveCustomer(customerDto);
        return "redirect:/customers";
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("id") Integer id) {
        customerService.deleteCustomerById(id);
        return "redirect:/customers";
    }
}
