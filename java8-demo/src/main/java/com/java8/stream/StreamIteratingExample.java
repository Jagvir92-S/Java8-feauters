package com.java8.stream;

import java.util.stream.Stream;

//use stream to iterate any number of times.
public class StreamIteratingExample {

	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1)
				.filter(element -> element % 5 == 0).limit(6)
				.forEach(System.out::println);
	}
}
