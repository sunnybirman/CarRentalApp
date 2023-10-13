package com.allane.carrental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ContractOverview {
    private Long contractId;

    private CustomerSummaryDTO customerSummary;

    private VehicleSummaryDTO vehicleSummary;
}
