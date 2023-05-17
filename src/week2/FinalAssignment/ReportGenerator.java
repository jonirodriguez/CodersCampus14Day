package com.coderscampus.service;

import java.util.List;

import com.coderscampus.domain.Product;

public class ReportGenerator {

	public void generateLowInventoryReport(List<Product> products) {
		
		for ( Product product : products) {
			
			boolean highEndProduct;
			boolean lowEndProduct;
			
			if ((product.getPrice() >= .99) && (product.getPrice() <= 100.00)) { 
				lowEndProduct = true;
				
				if ((lowEndProduct == true) && (product.getQuantity() <= 20)) {
					System.out.println("");
					System.out.println("LOW-END PRODUCT STOCK ALERT");
					System.out.println("Product ID " + product.getId() + " (" + product.getName() + ") has a quantity of " + product.getQuantity() + "!");
					System.out.println("As a reminder, since this is a product costing less than $100, any quantity below [20] is considered LOW STOCK.");
				}
			}
				
			if (product.getPrice() >= 101.00) { 
				highEndProduct = true;
				
				if ((highEndProduct == true) && (product.getQuantity() <= 10)) {
					System.out.println("");
					System.out.println("HIGH-END PRODUCT STOCK ALERT");
					System.out.println("Product ID " + product.getId() + " (" + product.getName() + ") has a quantity of " + product.getQuantity() + "!");
					System.out.println("As a reminder, since this is a product costing more than $101, any quantity below [10] is considered LOW STOCK.");
				}
			}
		}
	}
}
