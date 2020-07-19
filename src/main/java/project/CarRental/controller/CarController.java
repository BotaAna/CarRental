package project.CarRental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        List<CarDto> cars = carService.getAllCars();
        model.addAttribute("carsList", cars);
        return "cars";
    }

    @GetMapping("/carsByDepartment")
    public String carsByDepartment(Model model, @RequestParam("department") String department) {
        List<CarDto> cars = carService.getCarsbyDepartmet(department);
        model.addAttribute("carsList", cars);
        return "carsByDepartment";
    }

    @GetMapping("/carsByDepartmentForUser")
    public String carsByDepartmentForUser(Model model, @RequestParam("department") String department) {
        List<CarDto> cars = carService.getCarsbyDepartmet(department);
        model.addAttribute("carsList", cars);
        return "carsByDepartmentForUser";
    }

    @GetMapping("/addCar")
    public String addCarForm() {
        return "addCar";
    }

    @PostMapping("/addCar")
    public String addCar(CarDto carDto) {
        carService.saveCar(carDto);
        return "redirect:/cars";
    }

    @GetMapping("/editCar")
    public String editCar(Model model, @RequestParam("id") Integer id) {
        CarDto carDto = carService.getCarById(id);
        model.addAttribute("car", carDto);
        return "editCar";
    }

    @PostMapping("/editCar")
    public String saveEditedCar(CarDto carDto) {
        carService.saveCar(carDto);
        return "redirect:/cars";
    }

    @GetMapping("/deleteCar")
    public String deleteCar(@RequestParam("id") Integer id) {
        carService.deleteCarById(id);
        return "redirect:/cars";
    }

    //przeniesc gdzies indziej
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    //przeniesc gdzies indziej
    @GetMapping("/userPanel")
    public String userPanel() {
        return "userPanel";
    }

    //przeniesc gdzies indziej
    @GetMapping("/adminPanel")
    public String adminPanel() {
        return "adminPanel";
    }

}
