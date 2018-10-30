package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Bacon extends PizzaToppings {

	Pizza pizza;
	
	/**
	 * @param bacPizza
	 */
	public Bacon(Pizza bacPizza) {
		this.pizza = bacPizza;
	}
		
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Bacon";
	}

}
