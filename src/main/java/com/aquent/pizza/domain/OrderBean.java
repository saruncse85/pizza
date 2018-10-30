package com.aquent.pizza.domain;

import java.io.Serializable;

/**
 * @author asundaramoorthy
 *
 */
public class OrderBean implements Serializable, Comparable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Pizza pizza;
	
	private Long time;

	public OrderBean() {
		
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	@Override
	public int compareTo(Object o) {
		OrderBean newOrder = (OrderBean)o;
		if(this.getTime() == newOrder.getTime())
			return 0;
		else 
			return this.getTime() > newOrder.getTime() ? 1 : -1;
		
	}
}
