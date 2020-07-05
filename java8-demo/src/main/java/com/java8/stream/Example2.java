package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = new ArrayList<Float>();

		// filtering data without using stream
		for (Product p : productsList) {
			if (p.price > 29000) {
				productPriceList.add(p.price);
			}
		}
		System.out.println(productPriceList);

		System.err.println("-------------------------------");

		// filtering data by using stream

		List<Float> listP = productsList.stream().filter(p -> p.price > 29000)// filtering data
				.map(p -> p.price)// fetching price
				.collect(Collectors.toList());// collecting as list
		System.out.println(listP);
	}

}
