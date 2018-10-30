package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public abstract class PizzaToppings extends Pizza {
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.Pizza#getDescription()
	 */
	public abstract String getDescription();
	
}
