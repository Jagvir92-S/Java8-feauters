package com.java8.unitexercisesolutionjava7and8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.unitexercisesolutionjava7and8.Person;

//Consumer Interface example
public class StandardFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40), new Person("Lewis",
						"Carrol", 42), new Person("Thomes", "Carley", 44),
				new Person("Mathew", "Armold", 55));
		// store list by name
		Collections.sort(people,
				(o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		printConditionally(people, p -> true, p -> System.out.println(p));

		System.err.println(">>>>>>>prints Last Name Beginning With C<<<<<<<");

		printConditionally(people, (p) -> p.getLastName().startsWith("C"),
				p -> System.out.println(p));
		System.err.println(">>>>>>>prints First Name Beginning With C<<<<<<<");
		printConditionally(people, (p) -> p.getFirstName().startsWith("C"),
				p -> System.out.println(p.getFirstName()));
	}

	// prints all people that have last name beginning with C
	private static void printConditionally(List<Person> people,
			Predicate<Person> condition, Consumer<Person> consumer) {
		for (Person p : people) {
			if (condition.test(p)) {
				consumer.accept(p);
			}
		}
	}
}