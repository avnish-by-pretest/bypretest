package com.java8.pretest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java8.pretest.dto.AvailabilityRequestDTO;
import com.java8.pretest.dto.AvailabilityResponseDTO;
import com.java8.pretest.service.AvailabilityWithCapacityService;

@RestController
public class AvalabilityAndCapacityController {
        @Autowired
        AvailabilityWithCapacityService availabilityCapacityService;
        
        @PostMapping("/getProdAvailability")
        public ResponseEntity getProdAvailability(@RequestBody AvailabilityRequestDTO availRequestDTO){
                AvailabilityResponseDTO availResponseDTO = availabilityCapacityService.getProdAvailability(availRequestDTO);

                if(availResponseDTO==null)
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
                if(availResponseDTO.getStatus().compareTo("-1")==0)
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);


                return ResponseEntity.status(HttpStatus.OK).body(availResponseDTO);

        }
}
