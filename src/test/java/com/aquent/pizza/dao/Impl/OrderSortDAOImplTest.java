package com.aquent.pizza.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.dao.OrderSortDAO;
import com.aquent.pizza.dao.impl.OrderSortDAOImpl;
import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderSortDAOImplTest {

	@InjectMocks
	private OrderSortDAO orderDao = new OrderSortDAOImpl();
	
	/**
	 * 
	 */
	@Before
	public void injectMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testGetData() throws Exception {
		Assert.assertNotNull(orderDao.getData("sample_data_ordered.txt"));
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testWriteData() throws Exception {
		Assert.assertSame(true, orderDao.writeData(getOrders(), "outputFile.txt"));
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
