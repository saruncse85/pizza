package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class CheesePizza extends PizzaType {

	Pizza pizza;
	
	/**
	 * @param pizza
	 */
	public CheesePizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.type.PizzaType#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Cheese Pizza";
	}
	
}
