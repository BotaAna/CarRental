package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.RentalCarDto;
import project.CarRental.service.RentalCarService;

import java.util.List;

@Controller
public class RentalCarController {

    private RentalCarService rentalCarService;

    public RentalCarController(RentalCarService rentalCarService) {
        this.rentalCarService = rentalCarService;
    }

    @GetMapping("/rentalCars")
    public String rentalCars(Model model) {
        List<RentalCarDto> rentalCars = rentalCarService.getAllRentalCar();
        model.addAttribute("rentalCarList", rentalCars);
        return "rentalCars";
    }

    @GetMapping("/addRentalCar")
    public String addRentalCarForm() {
        return "addRentalCar";
    }

    @PostMapping("/addRentalCar")
    public String addRentalCar(RentalCarDto rentalCarDto) {
        rentalCarService.saveRentalCar(rentalCarDto);
        return "redirect:/rentalCars";
    }

    @GetMapping("/editRentalCar")
    public String editRentalCar(Model model, @RequestParam("id") Integer id) {
        RentalCarDto rentalCarDto = rentalCarService.getRenatlCarById(id);
        model.addAttribute("rentalCar", rentalCarDto);
        return "editRentalCar";
    }

    @PostMapping("/editRentalCar")
    public String saveEditedRentalCar(RentalCarDto rentalCarDto) {
        rentalCarService.saveRentalCar(rentalCarDto);
        return "redirect:/rentalCars";
    }

    @GetMapping("/deleteRentalCar")
    public String deleteRentalCar(@RequestParam("id") Integer id) {
        rentalCarService.deleteRentalCarById(id);
        return "redirect:/rentalCars";
    }
}
