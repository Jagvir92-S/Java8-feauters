package com.java8.base64encodedecode;

import java.util.Base64;

public class MIMEEncodingandDecoding {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String message = "Hello, \n You are informed regarding your inconsistency of work";
		String eStr = encoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME message " + eStr);

		Base64.Decoder decoder = Base64.getMimeDecoder();
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded message " + dStr);
	}

}
