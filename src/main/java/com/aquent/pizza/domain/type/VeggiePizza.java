package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class VeggiePizza extends PizzaType {

	Pizza pizza;
	
	/**
	 * @param pizza
	 */
	public VeggiePizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.type.PizzaType#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Veggie Pizza";
	}
	
}
