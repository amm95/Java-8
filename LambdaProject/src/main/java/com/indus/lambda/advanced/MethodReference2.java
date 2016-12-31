package com.indus.lambda.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.indus.lambda.basics.Person;

public class MethodReference2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Avi", "Reddy", 24), new Person("Divya", "Reddy", 24),
				new Person("Rakesh", "Reddy", 24), new Person("Prashanth", "Kumar", 24),
				new Person("Rajesh", "Kumar", 24), new Person("Rakul Preet", "Singh", 24));

		performConditionally(people, p -> true,System.out::println);

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {

		for (Person person : people) {

			if (predicate.test(person)) {

				consumer.accept(person);
			}
		}
	}
}
