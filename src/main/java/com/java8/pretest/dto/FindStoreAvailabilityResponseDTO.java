package com.java8.pretest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindStoreAvailabilityResponseDTO {

	String storeID;
	Date requestDate;
	String status;

}
