package com.aquent.pizza;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aquent.pizza.constants.PizzaConstants;
import com.aquent.pizza.controller.OrderSortController;
import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.service.OrderSortService;

/**
 * @author asundaramoorthy
 *
 */
@SpringBootApplication
public class PizzaApplication {

	@Autowired
	OrderSortService orderSortService;
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PizzaApplication.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			ApplicationContext appCtx = SpringApplication.run(PizzaApplication.class, args);
			
			OrderSortController osController = appCtx.getBean(OrderSortController.class);
			if (args.length == 3) {
				List<OrderBean> orders = osController.getData(args[1]);
				boolean flag = osController.writeData(orders, args[2]);
				if (flag) {
					LOGGER.info(PizzaConstants.FILE_GENERATED);
				}
			} else {
				throw new Exception(PizzaConstants.INVALID_PARAMETERS);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Exception occurred while initializing the application"+e.getMessage());
		}
		
	}
}
