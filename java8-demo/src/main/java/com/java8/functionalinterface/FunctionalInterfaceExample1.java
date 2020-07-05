package com.java8.functionalinterface;

@FunctionalInterface
interface sayable {
	void say(String msg);
}

public class FunctionalInterfaceExample1 implements sayable {

	public static void main(String[] args) {
		FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
		fie.say("Hello there");
	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

}
