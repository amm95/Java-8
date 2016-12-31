package com.indus.lambda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseSolution {

	interface Condition {

		boolean test(Person person);
	}

	private static void printAll(List<Person> people) {
		
		System.out.println("Print all the people");

		for (Person person : people) {

			System.out.println(person.toString());
		}
	}

	private static void printLastNameBeginningWithS(List<Person> people) {

		System.out.println("Last Name starting with letter S: " );
		
		for (Person person : people) {

			if (person.getLastName().startsWith("S")) {

				System.out.println(person);
			}
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {

		for (Person person : people) {

			if (condition.test(person)) {

				System.out.println(person);
			}
		}
	}

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Avi", "Reddy", 24), new Person("Divya", "Reddy", 24),
				new Person("Rakesh", "Reddy", 24), new Person("Prashanth", "Kumar", 24),
				new Person("Rajesh", "Kumar", 24), new Person("Rakul Preet", "Singh", 24));

		// TODO: Step 1: Sort list by last name

		System.out.println("Sort based on Last Name");
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// TODO: Step 2: Create a method that prints all the elements in the
		// list

		
		printAll(people);

		// TODO: Step 3: Create a method that prints all the people that have
		// their last name beginning with letter 'C'

		printLastNameBeginningWithS(people);

		System.out.println("Last Name starting with letter K: " );
		
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person person) {
						
				return person.getLastName().startsWith("K");
			}
		});

		
		System.out.println("First Name starting with letter R: " );
		
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person person) {
						
				return person.getFirstName().startsWith("R");
			}
		});
	}

}
