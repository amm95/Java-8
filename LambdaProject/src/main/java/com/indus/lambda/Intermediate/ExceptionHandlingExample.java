package com.indus.lambda.Intermediate;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		int key = 2;

		/*
		 * process(numbers, key, (v, k) -> {
		 * 
		 * try {
		 * 
		 * System.out.println(v / k);
		 * 
		 * } catch (ArithmeticException e) {
		 * 
		 * System.out.println("An Arithmetic exception has occured"); }
		 * 
		 * });
		 */

		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : numbers) {

			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		
		// you can write the try catch block here
		return (v, k) -> consumer.accept(v, k);

	}

}
