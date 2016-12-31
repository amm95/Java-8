package com.indus.lambda.advanced;

public class MethodReference {

	public static void main(String[] args) {

		// Thread thread = new Thread(() -> printMsg());

		// method reference expression for the above line

		Thread thread = new Thread(MethodReference::printMsg);

		thread.start();
	}

	public static void printMsg() {

		System.out.println("Hello");
	}

}
