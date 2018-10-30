package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Olive extends PizzaToppings {

	Pizza pizza; 
	
	/**
	 * @param olivePizza
	 */
	public Olive(Pizza olivePizza) {
		this.pizza = olivePizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Olive";
	}

}
