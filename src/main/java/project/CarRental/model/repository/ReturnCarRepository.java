package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import project.CarRental.model.entity.ReturnCar;

public interface ReturnCarRepository extends CrudRepository<ReturnCar, Integer> {
}
