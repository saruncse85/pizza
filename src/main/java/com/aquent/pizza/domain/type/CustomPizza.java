package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

public class CustomPizza extends PizzaType {
	
	Pizza pizza;
	
	/**
	 * @param pizza
	 */
	public CustomPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.type.PizzaType#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Custom Pizza";
	}

}
