package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.entity.Car;
import project.CarRental.model.mappers.CarMapper;
import project.CarRental.model.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public CarDto getCarById(Integer id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()) {
            return CarMapper.INSTANCE.carToDto(car.get());
        }
        return null;
    }

    public void saveCar(CarDto carDto) {
        Car car = CarMapper.INSTANCE.dtoToCar(carDto);
        carRepository.save(car);
    }

    public void deleteCarById(Integer id) {
        carRepository.deleteById(id);
    }

}
