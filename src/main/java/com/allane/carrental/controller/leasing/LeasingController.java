package com.allane.carrental.controller.leasing;

import com.allane.carrental.dto.LeasingContractDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LeasingController implements LeasingApi{


    @Override
    public ResponseEntity<LeasingContractDTO> createLeasingContract(LeasingContractDTO contractDTO) {
        return null;
    }

    @Override
    public ResponseEntity<LeasingContractDTO> updateLeasingContract(Long contractId, LeasingContractDTO contractDTO) {
        return null;
    }

    @Override
    public ResponseEntity<LeasingContractDTO> getLeasingContract() {
        return null;
    }


}
