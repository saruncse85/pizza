package com.aquent.pizza.domain.type;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MeatPizzaTest {
	
	/**
	 * 
	 */
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * 
	 */
	@Test
	public void testGetDescription() {
		Pizza meatPizza = new Small();
		meatPizza = new MeatPizza(meatPizza);
		
		Assert.assertEquals("Small (10\") , Meat Pizza", meatPizza.getDescription());
	}
}
