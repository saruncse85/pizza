package com.aquent.pizza.controller;

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

import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;
import com.aquent.pizza.service.OrderSortService;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderSortControllerTest {
	
	@InjectMocks
	private OrderSortController orderController = new OrderSortController();
	
	@Mock
	private OrderSortService orderService;
	
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
		//mock the object
		Mockito.when(orderService.getData(new String())).thenReturn(getOrders());
		
		//test
		Assert.assertTrue(orderController.getData(ArgumentMatchers.anyString()).size()==1);
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void writeData() throws Exception {
		//Mock the object
		Mockito.when(orderService.writeData(ArgumentMatchers.any(ArrayList.class),
				ArgumentMatchers.anyString())).thenReturn(true);
		
		//test
		Assert.assertTrue(orderController.writeData(getOrders(), "outputFile.txt"));
		
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testReadData_Null() throws Exception {
		//Mock the object
		Mockito.when(orderService.getData(new String())).thenReturn(null);
		
		//test
		Assert.assertNull(orderController.getData(ArgumentMatchers.anyString()));
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

