package com.java8.pretest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindStoreAvailabilityRequestDTO {

	String storeID;
	Date requestDate;

}
