package com.indus.lambda.Intermediate;

public class ClosuresExample {

	public static void main(String[] args) {
		
		int i = 10;
		
		//doProcess(i, p -> System.out.println(i+2));
		
		doProcess(i, new Process() {
			
			@Override
			public void process(int i) {

				System.out.println(i);
			}
		});


	}

	public static void doProcess(int i, Process p){
		
		p.process(i);
	}

	interface Process {
		void process(int i);
	}

}
