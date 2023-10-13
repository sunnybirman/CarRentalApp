package com.allane.carrental.repository;

import com.allane.carrental.entity.LeasingContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeasingContractRepository extends JpaRepository<LeasingContract, Long> {
}
