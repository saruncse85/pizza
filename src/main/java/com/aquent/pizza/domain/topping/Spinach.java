package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Spinach extends PizzaToppings {
	
	Pizza pizza;
	
	/**
	 * @param spiPizza
	 */
	public Spinach(Pizza spiPizza) {
		this.pizza = spiPizza;
	}

	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Spinach";
	}

}
