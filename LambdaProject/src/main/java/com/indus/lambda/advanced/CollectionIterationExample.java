package com.indus.lambda.advanced;

import java.util.Arrays;
import java.util.List;

import com.indus.lambda.basics.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Avi", "Reddy", 24), new Person("Divya", "Reddy", 24),
				new Person("Rakesh", "Reddy", 24), new Person("Prashanth", "Kumar", 24),
				new Person("Rajesh", "Kumar", 24), new Person("Rakul Preet", "Singh", 24));

		// for each
		for (Person person : people) {

			System.out.println(person);
		}
		
		//lambda for each
		people.forEach(p -> System.out.println(p));
		
		// for each using method references
		people.forEach(System.out::println);
	}

}
