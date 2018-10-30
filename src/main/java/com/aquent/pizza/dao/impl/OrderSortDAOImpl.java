package com.aquent.pizza.dao.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.aquent.pizza.constants.PizzaConstants;
import com.aquent.pizza.dao.OrderSortDAO;
import com.aquent.pizza.domain.OrderBean;
import com.aquent.pizza.domain.Pizza;
import com.aquent.pizza.domain.size.Small;
import com.aquent.pizza.domain.topping.Chicken;
import com.aquent.pizza.domain.type.CheesePizza;
import com.aquent.pizza.domain.type.MeatPizza;
import com.aquent.pizza.domain.type.VeggiePizza;
import com.aquent.pizza.util.DateUtil;

/**
 * @author asundaramoorthy
 *
 */
@Repository
public class OrderSortDAOImpl implements OrderSortDAO {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(OrderSortDAOImpl.class);
	
	/* (non-Javadoc)
	 * @see com.aquent.pizza.dao.OrderSortDAO#getData(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderBean> getData(String fileName) throws Exception {
		List<OrderBean> orderList = new ArrayList<OrderBean>();
		
		File file = null;
		
		try {
			file = new File(fileName);
			LOGGER.info("Started reading the input file");
			Scanner scan = new Scanner(file);
			scan.nextLine();
			while(scan.hasNextLine()) {
				String orderInfo = scan.nextLine();
				if(orderInfo != null && !"".equalsIgnoreCase(orderInfo)) {
					StringTokenizer strTknzer = new StringTokenizer(orderInfo, "\t");
					while(strTknzer.hasMoreTokens()) {
						String name = strTknzer.nextToken();
						long time = Long.valueOf(strTknzer.nextToken());
						
						OrderBean order = new OrderBean();
						Pizza pizza = new Small();
						
						if(name.contains("Veg")) {
							pizza = new VeggiePizza(pizza);
						} else if (name.contains("Chic")) {
							pizza = new Chicken(pizza);
						} else if (name.contains("Meat")) {
							pizza = new MeatPizza(pizza);
						} else {
							pizza = new CheesePizza(pizza);
						}
						pizza.name = name;
						order.setPizza(pizza);
						order.setTime(time);
						
						orderList.add(order);
					}
				}
			}
			Collections.sort(orderList);
			
			scan.close();
			LOGGER.info("Completed reading the input file");
			
		} catch(IOException ioe) {
			LOGGER.error("Error occurred while reading data from input file "+ioe.getMessage());
			throw ioe;
		} catch (Exception ex) {
			LOGGER.error("Error occurred while processing the file "+ex.getMessage());
			throw ex;
		}
		return orderList;
	}

	/* (non-Javadoc)
	 * @see com.aquent.pizza.dao.OrderSortDAO#writeData(java.util.List, java.lang.String)
	 */
	@Override
	public boolean writeData(List<OrderBean> orders, String outputFile) throws Exception {
		File file = new File(outputFile);
		FileOutputStream fout = null;
		BufferedWriter bw = null;
		boolean flag = false;
		int rowNo = 0;
		String line = "";
		try {
			LOGGER.info("Started writing the sorted value to output file");
			StringBuilder output = new StringBuilder();
			output.append(getHeader()).append("\n");
			fout = new FileOutputStream(file);
			bw = new BufferedWriter(new OutputStreamWriter(fout));
			bw.write(getHeader());
			bw.newLine();
			for (OrderBean order : orders) {
				line = String
						.format("%-6d\t%-10s\t%-15s", ++rowNo, order.getPizza().name
								, DateUtil
								.convertEpochToUTC(order.getTime() * 1000));
				bw.write(line);
				
				bw.newLine();
			}
			bw.flush();
			flag = true;
		} catch (Exception e) {
			LOGGER.error("Error:" + e.getMessage(), e);
			throw e;
		} finally {
			bw.close();
			fout.close();
		}
		LOGGER.info("Completed writing the sorted value to output file");
		return flag;
	}
	
	private String getHeader() {
		return String.format("%6s\t%10s\t%15s", PizzaConstants.ORDER_NO,
				PizzaConstants.ORDER_NAME, PizzaConstants.ORDER_TIME);
	}
}
