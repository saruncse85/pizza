package com.aquent.pizza;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class PizzaApplicationTests {

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMain() {
		String[] arg = new String[] { "Pizza", "sample_data_ordered.txt", "outputFile.txt" };
		PizzaApplication.main(arg);
		Assert.assertTrue(true);
	}
	
}
