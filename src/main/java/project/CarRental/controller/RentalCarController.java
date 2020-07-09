package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import project.CarRental.service.RentalCarService;

@Controller
public class RentalCarController {

    private RentalCarService rentalCarService;

    public RentalCarController(RentalCarService rentalCarService) {
        this.rentalCarService = rentalCarService;
    }
}
