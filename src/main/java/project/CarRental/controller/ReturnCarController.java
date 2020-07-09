package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.ReturnCarService;

@Controller
public class ReturnCarController {

    private ReturnCarService returnCarService;

    public ReturnCarController(ReturnCarService returnCarService) {
        this.returnCarService = returnCarService;
    }
}
