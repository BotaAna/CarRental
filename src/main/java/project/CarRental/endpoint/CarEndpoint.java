package project.CarRental.endpoint;

import org.springframework.web.bind.annotation.*;
import project.CarRental.model.dto.CarDto;
import project.CarRental.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarEndpoint {
/*
    private CarService carService;

    public CarEndpoint(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars", produces = "application/json")
    List<CarDto> carsList() {
        return carService.getAllCars();
    }

    @PutMapping(value = "/cars")
    void addCar(@RequestBody CarDto carDto) {
        carService.saveCar(carDto);
    }


 */
}
