package com.indus.lambda.basics;

@FunctionalInterface // interface with one abstract method, it is optional for lambda
public interface Greeting {

	public abstract void perform();
	
	//public void another();
}
