package com.indus.lambda.basics;

public class Greeter {

	public void greet(Greeting greeting) {

		greeting.perform();
	}

	public static void main(String[] args) {

		// Greeter greeter = new Greeter();

		// greeter.greet();

		Greeting lambdaGreeting = () -> System.out.println("Hello World from lambda greeting");

		lambdaGreeting.perform();

		Greeting innerClassGreeting = new Greeting() {

			@Override
			public void perform() {

				System.out.println("Hello World from Anonymous inner class");
			}
		};

		innerClassGreeting.perform();

		MyLambda myLambdaExpression = () -> System.out.println("Hello Lambda");

		myLambdaExpression.foo();

		Addition addFunction = (int a, int b) -> a + b;

		System.out.println(addFunction.add(12, 4));

	}

	interface MyLambda {

		void foo();

	}

	interface Addition {

		int add(int a, int b);
	}
}
