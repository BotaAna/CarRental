package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.entity.Car;
import project.CarRental.model.mappers.CarMapper;
import project.CarRental.model.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDto> getAllCars() {
        Iterable<Car> carsList = carRepository.findAll();
        ArrayList<CarDto> result = new ArrayList<>();
        for(Car car : carsList) {
            result.add(CarMapper.INSTANCE.carToDto(car));
        }
        return result;
    }

    public void saveCar(CarDto carDto) {
        Car car = CarMapper.INSTANCE.dtoToCar(carDto);
        carRepository.save(car);
    }

}
