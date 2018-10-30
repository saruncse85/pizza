package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Pineapple extends PizzaToppings {
	
	Pizza pizza;
	
	/**
	 * @param pinePizza
	 */
	public Pineapple(Pizza pinePizza) {
		this.pizza = pinePizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Pineapple";
	}

}
