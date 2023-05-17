package com.coderscampus.app;

import java.nio.file.Path;
import java.util.List;

import com.coderscampus.domain.Product;
import com.coderscampus.service.CSVReader;
import com.coderscampus.service.ReportGenerator;

public class Main {

	public static void main(String[] args) {
		
		// Inside the main method, instantiate the CSVReader class.
		CSVReader reader = CSVReader.getInstance();
		
		// Call the "readProductsFromFile" method of the CSVReader instance
		reader.readProductsFromFile(Path.of("Current-Product-Inventory.txt"));
		List<Product> products = reader.readProductsFromFile(Path.of("Current-Product-Inventory.txt"));
		
		// Instantiate the ReportGenerator class
		ReportGenerator reportGenerator = new ReportGenerator();
		
		// call the generateLowInventoryReport method, passing the ArrayList of products
		reportGenerator.generateLowInventoryReport(products);
	}

}
