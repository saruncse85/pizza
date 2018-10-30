package com.aquent.pizza.domain.size;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class SmallTest {

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
		Pizza smPizza = new Small();
		Assert.assertEquals("Small (10\") ", smPizza.getDescription());
	}
	
}
