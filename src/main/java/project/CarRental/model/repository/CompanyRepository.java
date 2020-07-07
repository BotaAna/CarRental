package project.CarRental.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;
import project.CarRental.model.entity.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
