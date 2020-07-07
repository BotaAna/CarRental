package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
