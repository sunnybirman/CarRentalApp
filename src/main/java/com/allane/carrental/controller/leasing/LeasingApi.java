package com.allane.carrental.controller.leasing;

import com.allane.carrental.dto.LeasingContractDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Tag(name = "Leasing Controller", description = "Endpoints for managing leasing contracts")
public interface LeasingApi {

    @PostMapping(value ="/contracts", produces = "application/json")
    @Operation(summary = "Create a new leasing contract")
    @ApiResponse(responseCode = "201", description = "Leasing contract created")
    @ApiResponse(responseCode = "400", description = "Bad request. Invalid input data")
    @ApiResponse(responseCode = "403", description = "Forbidden. Access denied")
    ResponseEntity<LeasingContractDTO> createLeasingContract(LeasingContractDTO contractDTO);

    @PutMapping(value = "/contracts/{contractId}", produces = "application/json")
    @Operation(summary = "Update an existing leasing contract")
    @ApiResponse(responseCode = "200", description = "Leasing contract updated")
    @ApiResponse(responseCode = "400", description = "Bad request. Invalid input data")
    @ApiResponse(responseCode = "404", description = "Leasing contract not found")
    @ApiResponse(responseCode = "403", description = "Forbidden. Access denied")
    ResponseEntity<LeasingContractDTO> updateLeasingContract(Long contractId, LeasingContractDTO contractDTO);

    @GetMapping(value = "/contracts/{contractId}", produces = "application/json")
    @Operation(summary = "Get an existing leasing contract")
    @ApiResponse(responseCode = "200", description = "Leasing contract retrieved")
    @ApiResponse(responseCode = "404", description = "Leasing contract not found")
    ResponseEntity<LeasingContractDTO> getLeasingContract();

}
