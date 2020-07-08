package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.EmployeeDto;
import project.CarRental.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public String employees(Model model) {
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        model.addAttribute("employeesList", employees);
        return "employees";
    }

    @GetMapping("/addEmployee")
    public String addEmployeeForm() {
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(EmployeeDto employeeDto) {
        employeeService.saveEmployee(employeeDto);
        return "redirect:/employees";
    }

    @GetMapping("/editEmployee")
    public String editEmployee(Model model,
                          @RequestParam("id") Integer id) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employeeDto);
        return "editEmployee";
    }

    @PostMapping("/editEmployee")
    public String saveEditedEmployee(EmployeeDto employeeDto) {
        employeeService.saveEmployee(employeeDto);
        return "redirect:/employees";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("id") Integer id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees";
    }
}
