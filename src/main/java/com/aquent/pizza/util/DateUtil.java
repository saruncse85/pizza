package com.aquent.pizza.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.aquent.pizza.constants.PizzaConstants;

/**
 * @author asundaramoorthy
 *
 */
public class DateUtil {

	/**
	 * @param epochDate
	 * @return
	 */
	public static String convertEpochToUTC(Long epochDate) {
		final SimpleDateFormat sdf = new SimpleDateFormat(PizzaConstants.DATE_FORMAT);
		sdf.setTimeZone(TimeZone.getTimeZone(PizzaConstants.UTC));
		String formattedDate = null;
		if (epochDate != null) {
			Date date = new Date(epochDate);
			formattedDate = sdf.format(date);
		}
		return formattedDate;
	}
}
