package com.java8.pretest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java8.pretest.dto.FindStoreAvailabilityRequestDTO;
import com.java8.pretest.dto.FindStoreAvailabilityResponseDTO;
import com.java8.pretest.service.FindStoreAvailabilityService;

@RestController
public class FindStoreAvailabilityController {
        @Autowired
        FindStoreAvailabilityService findStoreAvailabilityService;
        
        @PostMapping("/findStoreAvailability")
        public ResponseEntity getProdAvailability(@RequestBody FindStoreAvailabilityRequestDTO findStoreAvailDTO){
        	FindStoreAvailabilityResponseDTO findStoreAvailResponseDTO = findStoreAvailabilityService.getStoreAvailability(findStoreAvailDTO);

                if(findStoreAvailResponseDTO==null)
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
                if(findStoreAvailResponseDTO.getStatus().compareTo("-1")==0)
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);


                return ResponseEntity.status(HttpStatus.OK).body(findStoreAvailResponseDTO);

        }
}
