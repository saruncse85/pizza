package com.aquent.pizza.domain.topping;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class Chicken extends PizzaToppings {

	Pizza pizza;
	
	/**
	 * @param chkPizza
	 */
	public Chicken(Pizza chkPizza) {
		this.pizza = chkPizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.topping.PizzaToppings#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Chicken";
	}

}
