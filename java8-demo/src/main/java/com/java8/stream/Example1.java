package com.java8.stream;

import java.util.Arrays;
import java.util.List;

import com.java8.unitexercisesolutionjava7and8.Person;

public class Example1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40), new Person("Lewis",
						"Carrol", 42), new Person("Thomes", "Carley", 44),
				new Person("Mathew", "Armold", 55));

		people.stream().filter(p -> p.getLastName().startsWith("C"))
				.forEach(p -> System.out.println(p.getFirstName()));

		long count = people.stream()
				.filter(p -> p.getFirstName().startsWith("T")).count();
		System.out.println(count);
	}
}
