package com.java8.base64encodedecode;

import java.util.Base64;

public class URLEncodingandDecoding {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		String str = encoder
				.encodeToString("http://www.javatpoint.com/java-tutorial/"
						.getBytes());
		System.out.println("Encoded URL  " + str);

		Base64.Decoder decoder = Base64.getUrlDecoder();
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded URL  " + dStr);
	}

}
