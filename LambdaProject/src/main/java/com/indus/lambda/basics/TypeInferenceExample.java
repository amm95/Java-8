package com.indus.lambda.basics;

public class TypeInferenceExample {

	public static void main(String[] args) {

		//StringLength myLambda = (String s) -> s.length();
		//StringLength myLambda = (s) -> s.length();
		StringLength myLambda = s -> s.length();
		
		System.out.println(myLambda.getLength("Avinash"));
		
		printLambda(myLambda);
		printLambda(s -> s.length());

	}

	public static void printLambda(StringLength l){
		System.out.println(l.getLength("Avinash"));
	}
	interface StringLength {
		
		 int getLength(String s);
	}
}
