package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
