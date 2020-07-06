package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class FindMaxandMinProductPrice {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		// max() method to get max Product price
		Product productA = productsList.stream()
				.max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productA.name + "  " + productA.price);

		// min() method to get min Product price
		Product productB = productsList.stream()
				.min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(productB.name + "  " + productB.price);
	}

}
