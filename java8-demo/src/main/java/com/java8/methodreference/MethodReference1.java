package com.java8.methodreference;


public class MethodReference1 {
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}

	public static void main(String[] args) { 
		Sayable sayable=MethodReference1::saySomething();
		sayable.say();
	}
}
