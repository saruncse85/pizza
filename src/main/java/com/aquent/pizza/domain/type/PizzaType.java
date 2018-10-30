package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public abstract class PizzaType extends Pizza {

	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.Pizza#getDescription()
	 */
	public abstract String getDescription();
}
