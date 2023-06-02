package com.java8.pretest.dto;

import java.util.List;

import com.java8.pretest.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatResDTO {
	
	String prodId;
	List<Order> orderList;
}
