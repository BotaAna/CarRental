package project.CarRental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.CarRental.model.dto.CarDto;
import project.CarRental.model.entity.Car;
import project.CarRental.model.entity.Department;
import project.CarRental.model.mappers.CarMapper;
import project.CarRental.model.repository.CarRepository;
import project.CarRental.model.repository.DepartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarRepository carRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public CarService(CarRepository carRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
    }



    public List<CarDto> getAllCars() {
        Iterable<Car> carsList = carRepository.findAll();
        ArrayList<CarDto> result = new ArrayList<>();
        for(Car car : carsList) {
            result.add(CarMapper.INSTANCE.carToDto(car));
        }
        return result;
    }

//    public List<CarDto> getCarsbyDepartmet(String department) {
//        Iterable<Car> carsList = carRepository.findAll();
//        ArrayList<CarDto> result = new ArrayList<>();
//        for(Car car : carsList) {
//            if (car.getAvailableInDep().equals(department)) {
//                result.add(CarMapper.INSTANCE.carToDto(car));
//            }
//        }
//        return result;
//    }


    public CarDto getCarById(Integer id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()) {
            return CarMapper.INSTANCE.carToDto(car.get());
        }
        return null;
    }

    public void saveCar(CarDto carDto) {
        Car car = CarMapper.INSTANCE.dtoToCar(carDto);
        if(car.getDepartment() == null) {
            Department department = departmentRepository.findById(carDto.getAvailableInDep()).orElseThrow(() -> new IllegalArgumentException());
            car.setDepartment(department);
        }
        carRepository.save(car);
    }

    public void deleteCarById(Integer id) {
        carRepository.deleteById(id);
    }

}
