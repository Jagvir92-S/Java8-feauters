package com.java8.methodreference;

public class MethodReference2 {
	public static void threadStatus() {
		System.out.println("Thread is running..");
	}

	public void threadStatus1() {
		System.out.println("Thread is running1 ");
	}

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReference2::threadStatus);
		thread.start();
	}

}
