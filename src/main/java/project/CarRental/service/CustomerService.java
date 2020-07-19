package project.CarRental.service;

import org.springframework.stereotype.Service;

import project.CarRental.model.dto.CustomerDto;
import project.CarRental.model.entity.Customer;
import project.CarRental.model.mappers.CustomerMapper;
import project.CarRental.model.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerDto> getAllCustomers() {
        Iterable<Customer> customersList = customerRepository.findAll();
        ArrayList<CustomerDto> result = new ArrayList<>();
        for(Customer customer : customersList) {
            result.add(CustomerMapper.INSTANCE.customerToDto(customer));
        }
        return result;
    }

    public CustomerDto getCustomerById(Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()) {
            return CustomerMapper.INSTANCE.customerToDto(customer.get());
        }
        return null;
    }

    public void saveCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.dtoToCustomer(customerDto);
        customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }
}
