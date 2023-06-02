package com.java8.pretest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java8.pretest.dto.OrderStatReqDTO;
import com.java8.pretest.dto.OrderStatResDTO;
import com.java8.pretest.service.OrderStatService;

@RestController
public class OrderStatController {
	
	 @Autowired
     OrderStatService orderStatService;
	 
	 @PostMapping("/getOrderStats")
     public ResponseEntity getProdAvailability(@RequestBody OrderStatReqDTO orderStatReqDTO){
     	OrderStatResDTO orderStatResDTO = orderStatService.getOrderStat(orderStatReqDTO);

             if(orderStatResDTO==null)
                     return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
//             if(orderStatResDTO.getStatus().compareTo("-1")==0)
//                     return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);


             return ResponseEntity.status(HttpStatus.OK).body(orderStatResDTO);

     }
}
