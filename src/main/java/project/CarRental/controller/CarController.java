package project.CarRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.CarRental.model.dto.CarDto;
import project.CarRental.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(Model model) {
        List<CarDto> cars = carService.getAllCar();
        model.addAttribute("carsList", cars);
        return "cars";
    }

    @GetMapping("/addCar")
    public String addCarForm() {
        return "addCar";
    }
}
