package com.allane.carrental.service.customer;

import com.allane.carrental.dto.CustomerDTO;
import com.allane.carrental.mapper.CustomMapper;
import com.allane.carrental.entity.Customer;
import com.allane.carrental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer createCustomer(CustomerDTO customerDTO) {
        // Convert DTO to Entity and save
//        Customer customer = new Customer();

        Customer customer = CustomMapper.INSTANCE.customerDtoToEntity(customerDTO);
        // Set properties from DTO to Entity
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, CustomerDTO updatedCustomerDTO) {
        // Fetch the existing Customer by id
        // Update its properties from the updatedCustomerDTO
//        return customerRepository.save(existingCustomer);
        return null;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
