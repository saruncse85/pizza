package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Pepperoni extends PizzaToppings {

	Pizza pizza;
	
	/**
	 * @param pepPizza
	 */
	public Pepperoni(Pizza pepPizza) {
		this.pizza = pepPizza; 
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Pepperoni";
	}


}
