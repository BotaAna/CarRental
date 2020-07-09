package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.RentalCar;

@Repository
public interface RentalCarRepository extends CrudRepository<RentalCar, Integer> {
}
