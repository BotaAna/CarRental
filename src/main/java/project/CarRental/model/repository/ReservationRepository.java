package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
}
