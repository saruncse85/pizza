package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class BaconPizza extends PizzaType {

	Pizza pizza;
	
	/**
	 * @param pizza
	 */
	public BaconPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.type.PizzaType#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Bacon Pizza";
	}
}
