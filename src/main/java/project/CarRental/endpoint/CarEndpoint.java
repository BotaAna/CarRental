package project.CarRental.endpoint;

import org.springframework.web.bind.annotation.*;
import project.CarRental.model.dto.CarDto;
import project.CarRental.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarEndpoint {

    private CarService carService;

    public CarEndpoint(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars", produces = "application/json")
    List<CarDto> carsList() {
        return carService.getAllCars();
    }

    @GetMapping(value = "/cars/{id}", produces = "application/json")
    CarDto car(@PathVariable("id") Integer id) {
        return carService.getCarById(id);
    }

    @DeleteMapping(value = "/cars/{id}")
    void deleteCar(@PathVariable("id") Integer id) {
        carService.deleteCarById(id);
    }

    @PutMapping(value = "/cars")
    void addCar(@RequestBody CarDto carDto) {
        carService.saveCar(carDto);
    }

    @PostMapping(value = "/cars")
    void editCar(@RequestBody CarDto carDto) {
        carService.saveCar(carDto);
    }

}
