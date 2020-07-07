package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
