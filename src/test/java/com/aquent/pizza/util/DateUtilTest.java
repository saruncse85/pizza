package com.aquent.pizza.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author asundaramoorthy
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class DateUtilTest {

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
	public void testConvertEpochToUTC() throws Exception {
		Assert.assertNotNull(DateUtil.convertEpochToUTC(Long.valueOf(8237483)));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testConvertEpochToUTC_Null() throws Exception {
		Assert.assertNull(DateUtil.convertEpochToUTC(null));
	}

}