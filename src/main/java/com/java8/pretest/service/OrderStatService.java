package com.java8.pretest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.java8.pretest.dto.OrderStatReqDTO;
import com.java8.pretest.dto.OrderStatResDTO;
import com.java8.pretest.model.Order;

@Service
public class OrderStatService {

	List<Order> orderList = new ArrayList<>();

	public OrderStatResDTO getOrderStat(OrderStatReqDTO orderStatReqDto) {
			
		initializeData();
		
		
		//List<Order> capacityMatch = orderList.stream().filter(a -> a.getProdId()).mapToInt();
		Map<String, Integer> result1 = orderList.stream().collect(
                Collectors.toMap(Order::getProdId, Order::getQty, (qty1, qty2) -> qty1));
		
		System.out.println(result1);
		
		return null;

	}

	public void initializeData() {
		orderList.add(new Order("Order1", "Product1", "2021-03-16", 10));
		orderList.add(new Order("Order2", "Product2", "2021-03-19", 5));
		orderList.add(new Order("Order3", "Product1", "2021-03-16", 30));
		orderList.add(new Order("Order4", "Product4", "2021-03-20", 20));
		orderList.add(new Order("Order5", "Product2", "2021-03-16", 20));
	}
}
