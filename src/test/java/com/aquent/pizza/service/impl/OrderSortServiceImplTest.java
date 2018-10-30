package com.aquent.pizza.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.dao.OrderSortDAO;
import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;
import com.aquent.pizza.service.OrderSortService;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderSortServiceImplTest {

	@Mock
	private OrderSortDAO orderSortDAO;
	
	@InjectMocks
	private OrderSortService orderService = new OrderSortServiceImpl();
	
	/**
	 * 
	 */
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testGetData() throws Exception {
		//Mock the object
		Mockito.when(orderSortDAO.getData(ArgumentMatchers.anyString())).thenReturn(getOrders());
		//test here
		Assert.assertTrue(orderService.getData(new String()).size()==1);
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testWriteData() throws Exception {
		//Mock
		Mockito.when(orderSortDAO.writeData(ArgumentMatchers.any(ArrayList.class), 
				ArgumentMatchers.anyString())).thenReturn(true);
		//test here
		Assert.assertTrue(orderService.writeData(getOrders(), "outputFile.txt"));
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testGetData_Null() throws Exception {
		//Mock
		Mockito.when(orderSortDAO.getData(ArgumentMatchers.anyString())).thenReturn(null);
		//test here
		Assert.assertNull(orderService.getData(ArgumentMatchers.anyString()));
	}
	
	/**
	 * @return
	 */
	private List<OrderBean> getOrders() {
		List<OrderBean> orderList = new ArrayList<OrderBean>();
		OrderBean order = new OrderBean();
		Pizza pizza = new Small();
		pizza.name = "TestPizza";
		order.setPizza(pizza);
		order.setTime(new Long(34512351));
		orderList.add(order);
		return orderList;
	}
}
