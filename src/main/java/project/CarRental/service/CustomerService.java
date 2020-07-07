package project.CarRental.service;

import org.springframework.stereotype.Service;
import project.CarRental.model.repository.CustomerRepository;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
