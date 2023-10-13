package com.allane.carrental.controller.customer;

import com.allane.carrental.dto.CustomerDTO;
import com.allane.carrental.dto.LeasingContractDTO;
import com.allane.carrental.model.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Tag(name = "Customer Controller", description = "Endpoints for managing customer")
public interface CustomerApi {

    @PostMapping(value ="/customer", produces = "application/json")
    @Operation(summary = "Create a new customer")
    @ApiResponse(responseCode = "201", description = "Customer created")
    @ApiResponse(responseCode = "400", description = "Bad request. Invalid input data")
    @ApiResponse(responseCode = "403", description = "Forbidden. Access denied")
    ResponseEntity<Response> createCustomer(@RequestBody CustomerDTO customerDTO);

    @PutMapping(value = "/customer/{customerId}", produces = "application/json")
    @Operation(summary = "Update an existing customer")
    @ApiResponse(responseCode = "200", description = "Customer updated")
    @ApiResponse(responseCode = "400", description = "Bad request. Invalid input data")
    @ApiResponse(responseCode = "404", description = "Customer not found")
    @ApiResponse(responseCode = "403", description = "Forbidden. Access denied")
    ResponseEntity<Response> updateCustomer(@PathVariable long customerId, @RequestBody @Valid CustomerDTO customerDTO);

    @GetMapping(value = "/customer/{customerId}", produces = "application/json")
    @Operation(summary = "Get an existing customer")
    @ApiResponse(responseCode = "200", description = "Customer retrieved")
    @ApiResponse(responseCode = "404", description = "Customer contract not found")
    ResponseEntity<Response> getCustomer(@PathVariable long customerId);
}
