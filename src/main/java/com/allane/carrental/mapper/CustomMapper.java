package com.allane.carrental.mapper;

import com.allane.carrental.dto.CustomerDTO;
import com.allane.carrental.dto.LeasingContractDTO;
import com.allane.carrental.dto.VehicleSummaryDTO;
import com.allane.carrental.entity.Customer;
import com.allane.carrental.entity.LeasingContract;
import com.allane.carrental.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomMapper {
    CustomMapper INSTANCE = Mappers.getMapper(CustomMapper.class);
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "birthdate", source = "birthdate", dateFormat = "yyyy-MM-dd")
    Customer customerDtoToEntity(CustomerDTO dto);

    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "birthdate", source = "birthdate", dateFormat = "yyyy-MM-dd")
    CustomerDTO CustomerEntityToDTO(Customer entity);

    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "model", source = "model")
    @Mapping(target = "modelYear", source = "modelYear")
    @Mapping(target = "vin", source = "vehicleIdentificationNumber")
    @Mapping(target = "price", source = "price")
    Vehicle vehicleDtoToEntity(VehicleSummaryDTO dto);

    @Mapping(target = "brand", source = "brand")
    @Mapping(target = "model", source = "model")
    @Mapping(target = "modelYear", source = "modelYear")
    @Mapping(target = "vin", source = "vehicleIdentificationNumber")
    @Mapping(target = "price", source = "price")
    VehicleSummaryDTO vehicleEntityToDTO(Vehicle entity);

    @Mapping(target = "contractNumber", source = "monthlyRate")
    @Mapping(target = "monthlyRate", source = "monthlyRate")
    @Mapping(target = "customer", source = "")
    @Mapping(target = "", source = "")
    @Mapping(target = "", source = "")
    @Mapping(target = "", source = "")
    LeasingContract leasingDtoToEntity(LeasingContractDTO dto);
}
