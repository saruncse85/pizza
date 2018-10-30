package com.aquent.pizza.domain.type;

import com.aquent.pizza.domain.Pizza;

/**
 * @author asundaramoorthy
 *
 */
public class MeatPizza extends PizzaType {
	
	Pizza pizza;
	
	/**
	 * @param mPizza
	 */
	public MeatPizza(Pizza mPizza) {
		this.pizza = mPizza;
	}

	/* (non-Javadoc)
	 * @see com.aquent.pizza.domain.type.PizzaType#getDescription()
	 */
	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Meat Pizza";
	}

}
