package com.allane.carrental.controller.customer;

import com.allane.carrental.dto.CustomerDTO;
import com.allane.carrental.dto.LeasingContractDTO;
import com.allane.carrental.model.Response;
import com.allane.carrental.service.DatabaseService;
import com.allane.carrental.service.customer.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController implements CustomerApi {

    private final CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @Override
    public ResponseEntity<Response> createCustomer(CustomerDTO customerDTO) {
        customerService.createCustomer(customerDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body();
        return null;
    }

    @Override
    public ResponseEntity<Response> updateCustomer(long customerId, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Response> getCustomer(long customerId) {
        return null;
    }

}
