package com.allane.carrental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class VehicleSummaryDTO {
    private Long vehicleId;

    @NotBlank(message = "Brand is required")
    @Size(max = 50, message = "Brand must not exceed 50 characters")
    private String brand;

    @NotBlank(message = "Model is required")
    @Size(max = 50, message = "Model must not exceed 50 characters")
    private String model;

    @Min(value = 1900, message = "Model year should be greater than or equal to 1900")
    @Max(value = 2100, message = "Model year should be less than or equal to 2100")
    private int modelYear;

    @NotBlank(message = "Vehicle Identification Number is required")
    @Pattern(
            regexp = "[A-HJ-NPR-Z0-9]{17}",
            message = "Vehicle Identification Number (VIN) should be a 17-character alphanumeric string"
    )
    private String vehicleIdentificationNumber;
}
