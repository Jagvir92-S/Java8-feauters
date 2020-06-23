package com.java8.unitexercisesolutionjava7and8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExerciseSolutionJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 40), new Person("Lewis",
						"Carrol", 42), new Person("Thomes", "Carley", 44),
				new Person("Mathew", "Armold", 55));
		// store list by name
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		printAll(people);

		System.err.println(">>>>>>>prints Last Name Beginning With C<<<<<<<");

		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		System.err.println(">>>>>>>prints First Name Beginning With C<<<<<<<");
		printConditionally(people, new Condition() {
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	// prints all elements in the list
	private static void printAll(List<Person> persons) {
		for (Person p : persons) {
			System.out.println(p);
		}
	}

	// prints all people that have last name beginning with C
	private static void printConditionally(List<Person> people,
			Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}

interface Condition {
	boolean test(Person p);
}
