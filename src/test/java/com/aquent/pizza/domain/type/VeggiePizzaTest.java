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
public class VeggiePizzaTest {

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
		Pizza vegPizza = new Small();
		vegPizza = new VeggiePizza(vegPizza);
		
		Assert.assertEquals("Small (10\") , Veggie Pizza", vegPizza.getDescription());
	}
}
