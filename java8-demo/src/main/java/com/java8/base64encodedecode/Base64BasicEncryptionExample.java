package com.java8.base64encodedecode;

import java.nio.ByteBuffer;
import java.util.Base64;

public class Base64BasicEncryptionExample {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte arr[] = { 1, 2 };
		byte arr2[] = encoder.encode(arr);
		System.out.println("Encoded byte array " + arr2);

		byte arr3[] = new byte[5];// Make sure it has enough size to store
									// copied bytes
		int x = encoder.encode(arr, arr3); // Returns number of bytes written
		System.out.println("Encoded byte array written to another array: "
				+ arr3);
		System.out.println("Number of bytes written: " + x);

		// Encoding string
		String str = encoder.encodeToString("JavaTpont".getBytes());
		System.out.println("Encoded string: " + str);
		// Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		String dstr = new String(decoder.decode(str));
		System.out.println("Decoded string " + dstr);
	}

}
