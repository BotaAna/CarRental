package project.CarRental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.CarRental.model.dto.ReturnCarDto;
import project.CarRental.service.ReturnCarService;

import java.util.List;

@Controller
public class ReturnCarController {

    private ReturnCarService returnCarService;

    public ReturnCarController(ReturnCarService returnCarService) {
        this.returnCarService = returnCarService;
    }

    @GetMapping("/returnedCars")
    public String returnedCars(Model model) {
        List<ReturnCarDto> returnedCars = returnCarService.getAllReturnedCars();
        model.addAttribute("returnedCarsList", returnedCars);
        return "returnedCars";
    }

    @GetMapping("/addReturnCar")
    public String addReturnedCarForm() {
        return "addReturnedCar";
    }

    @PostMapping("/addReturnCar")
    public String addReturnedCar(ReturnCarDto returnCarDto) {
        returnCarService.saveReturnCar(returnCarDto);
        return "redirect:/returnedCars";
    }

    @GetMapping("/editReturnCar")
    public String editReturnCar(Model model, @RequestParam("id") Integer id) {
        ReturnCarDto returnCarDto = returnCarService.getReturnCarById(id);
        model.addAttribute("returnCar", returnCarDto);
        return "editReturnCar";
    }

    @PostMapping("/editReturnCar")
    public String saveEditedReturnCar(ReturnCarDto returnCarDto) {
        returnCarService.saveReturnCar(returnCarDto);
        return "redirect:/editReturnCar";
    }

    @GetMapping("/deleteReturnCar")
    public String deleteReturnCar(@RequestParam("id") Integer id) {
        returnCarService.deleteReturnCarById(id);
        return "redirect:/returnedCars";
    }

}
