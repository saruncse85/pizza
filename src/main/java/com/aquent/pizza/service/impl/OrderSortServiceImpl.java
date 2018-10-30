package com.aquent.pizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquent.pizza.dao.OrderSortDAO;
import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.service.OrderSortService;

/**
 * @author asundaramoorthy
 *
 */
@Service
public class OrderSortServiceImpl implements OrderSortService {

	/**
	 * 
	 */
	@Autowired
	public OrderSortDAO orderSortDAO;
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.service.OrderSortService#getData(java.lang.String)
	 */
	@Override
	public List<OrderBean> getData(String fileName) throws Exception {
		return orderSortDAO.getData(fileName);
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.service.OrderSortService#writeData(java.util.List, java.lang.String)
	 */
	@Override
	public boolean writeData(List<OrderBean> orders, String outputFile) throws Exception {
		return orderSortDAO.writeData(orders, outputFile);
	}

}
