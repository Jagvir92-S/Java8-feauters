package com.java8.unitexercisesolutionjava7and8;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40), new Person("Lewis",
						"Carrol", 42), new Person("Thomes", "Carley", 44),
				new Person("Mathew", "Armold", 55));

		System.err.println("Using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.err.println("using for in loop");
		for (Person p : people) {
			System.out.println(p);
		}

		System.err.println("using labda foreach loop");
		// people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);
	}
}
