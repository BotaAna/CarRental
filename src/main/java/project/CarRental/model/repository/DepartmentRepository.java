package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
