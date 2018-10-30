package com.aquent.pizza.domain.size;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public abstract class PizzaSize extends Pizza {

	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.Pizza#getDescription()
	 */
	public abstract String getDescription();
}
