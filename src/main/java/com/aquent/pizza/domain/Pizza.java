package com.aquent.pizza.domain;

/**
 * @author asundaramoorthy
 *
 */
public abstract class Pizza {
	
	public String name;
	
	public String description;
	
	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	public Long orderedTime;

	// in future we can add double cost() method and implement in all sub classes and calculate the cost by adding the cost from super class 
}
