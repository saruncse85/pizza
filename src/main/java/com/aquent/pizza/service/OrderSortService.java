package com.aquent.pizza.service;

import java.util.List;

import com.aquent.pizza.domain.OrderBean;

/**
 * @author asundaramoorthy
 *
 */
public interface OrderSortService {

	/**
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public List<OrderBean> getData(String fileName) throws Exception;
	
	/**
	 * @param orders
	 * @param outputFile
	 * @return
	 * @throws Exception
	 */
	public boolean writeData(List<OrderBean> orders, String outputFile) throws Exception;
}
