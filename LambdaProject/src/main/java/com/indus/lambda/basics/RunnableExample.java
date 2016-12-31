package com.indus.lambda.basics;

public class RunnableExample {

	// only for interfaces with one abstract method --> functional interfaces

	public static void main(String[] args) {
		
		// Anonymous inner class
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("New thread");
				
			}
		});
		
		myThread.start();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Lambda thread"));
		
		myLambdaThread.start();

	}

}
