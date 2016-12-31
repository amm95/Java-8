package com.indus.lambda.Intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.indus.lambda.basics.Person;

public class FunctionalInterface {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Avi", "Reddy", 24), new Person("Divya", "Reddy", 24),
				new Person("Rakesh", "Reddy", 24), new Person("Prashanth", "Kumar", 24),
				new Person("Rajesh", "Kumar", 24), new Person("Rakul Preet", "Singh", 24));

		// TODO: Step 1: Sort list by last name

		System.out.println("Sort based on Last Name");

		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// TODO: Step 2: Create a method that prints all the elements in the
		// list

		performConditionally(people, p -> true, p -> System.out.println(p));

		// TODO: Step 3: Create a method that prints all the people that have
		// their last name beginning with letter 'K'

		System.out.println("Last Name starting with letter K: ");

		performConditionally(people, p -> p.getLastName().startsWith("K"), p -> System.out.println(p));

		System.out.println("First Name starting with letter R: ");

		performConditionally(people, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p));

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
