package com.aquent.pizza.domain.type;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;

@RunWith(MockitoJUnitRunner.class)
public class CheesePizzaTest {

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetDescription() {
		Pizza cheesePizza = new Small();
		cheesePizza = new CheesePizza(cheesePizza);
		
		Assert.assertEquals("Small (10\") , Cheese Pizza", cheesePizza.getDescription());
	}
}
