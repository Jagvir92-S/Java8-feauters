package com.java8.functionalinterface;

@FunctionalInterface
interface sayable2 {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterfaceExample2 implements sayable2 {

	public static void main(String[] args) {
		FunctionalInterfaceExample2 example2 = new FunctionalInterfaceExample2();
		example2.say("Hello World !!!");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

}
