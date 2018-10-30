package com.aquent.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.service.OrderSortService;

/**
 * @author asundaramoorthy
 *
 */
@Controller
public class OrderSortController {

	@Autowired
	public OrderSortService service;
	
	/**
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public List<OrderBean> getData(String fileName) throws Exception {
		return service.getData(fileName);
	}
	
	/**
	 * @param orderList
	 * @param outputFile
	 * @return
	 * @throws Exception
	 */
	public boolean writeData(List<OrderBean> orderList, String outputFile) throws Exception {
		return service.writeData(orderList, outputFile);
	}
	
	
}
