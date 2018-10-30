package com.aquent.pizza.domain;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.domain.size.Small;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderBeanTest {

	/**
	 * 
	 */
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testGetPizza() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		OrderBean order = getOrderBean();
		final Field field = order.getClass().getDeclaredField("pizza");
		field.setAccessible(true);
		
		Pizza pizza = getNewSmallPizza();
		field.set(order, pizza);
		//when
		final Pizza pizzaObj = order.getPizza();
		//then
		Assert.assertEquals("Field wasn't retreived properly", pizzaObj, pizza);
	}
	
	/**
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testSetPizza() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		OrderBean order = getOrderBean();
		Pizza piz = getNewSmallPizza();
		//when
		order.setPizza(piz);
		
		//then
		final Field field = order.getClass().getDeclaredField("pizza");
		field.setAccessible(true);
		Assert.assertEquals("Fields didn't match", field.get(order), piz);
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetTime() {
		OrderBean order = getOrderBean();
		Assert.assertEquals(order.getTime(), new Long(8458745));
	}
	
	/**
	 * 
	 */
	@Test
	public void testSetTime() {
		OrderBean order = getOrderBean();
		order.setTime(new Long(8458745));
		Assert.assertEquals(order.getTime(), new Long(8458745));
	}
	
	/**
	 * 
	 */
	@Test
	public void testCompareTo() {
		OrderBean order = new OrderBean();
		order.setTime(new Long(8458745));
		Assert.assertSame(0,  order.compareTo(order));
	}
	
	/**
	 * @return
	 */
	private OrderBean getOrderBean() {
		OrderBean order = new OrderBean();
		Pizza pizza = new Small();
		pizza.name = "Test Pizza";
		
		order.setPizza(pizza);
		order.setTime(new Long(8458745));
		return order;
	}
	
	/**
	 * @return
	 */
	private Pizza getNewSmallPizza() {
		Pizza pizza = new Small();
		pizza.name = "Test Pizza";
		
		return pizza;
	}
}
