package com.coderscampus.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.coderscampus.domain.Product;

public class CSVReader {

	// Create field for instance of CSVReader
	private static CSVReader csvReader = null;
	
	// Creating a singleton...
	private CSVReader () {

	}
	
	public static CSVReader getInstance () {
		if (csvReader == null) {
			csvReader = new CSVReader();
		}
		return csvReader;
	}

	public List<Product> readProductsFromFile (Path filePath) {
		
		// Generate an empty list of products
		List<Product> products = new ArrayList<Product>();
		
		try {
			// Read CSV file in
			List<String> data = Files.readAllLines(filePath);
			
			// For each line, parse the product values
			data.stream()
				.forEach((String lineOfData) -> {
					Product product = new Product();
					String[] productData = lineOfData.split(",");
					product.setId(productData[0]); // Product ID
					product.setName(productData[1]); // Product Name 
					product.setQuantity(Integer.parseInt(productData[2])); // Product Quantity
					product.setPrice(Double.parseDouble(productData[3])); // Product Price
					products.add(product);	
				});
		
		// Deal with any exceptions...
		} catch (IOException e) {
			System.out.println("The requested file was unable to be found or read.");
			e.printStackTrace();
	    }
		
		return products;
	}
}
