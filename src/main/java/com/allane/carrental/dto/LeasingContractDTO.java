package com.allane.carrental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class LeasingContractDTO {
    private Long contractId;

    @NotBlank(message = "Contract number cannot be blank")
    private String contractNumber;

    @Positive(message = "Monthly rate must be a positive number")
    private double monthlyRate;

    @NotNull(message = "Customer summary cannot be null")
    private CustomerSummaryDTO customerSummary;

    @NotNull(message = "Vehicle summary cannot be null")
    private VehicleSummaryDTO vehicleSummary;

    @Positive(message = "Vehicle price must be a positive number")
    private double vehiclePrice;

    @Size(max = 255, message = "Contract details link must not exceed 255 characters")
    private String contractDetailsLink;
}
