package com.java8.methodreference;

interface MessageAble {
	Message getMessage(String msg);
}

class Message {
	public Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		MessageAble hello = Message::new;
		hello.getMessage("Hello");
	}

}
