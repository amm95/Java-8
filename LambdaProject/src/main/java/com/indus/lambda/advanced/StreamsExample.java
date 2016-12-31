package com.indus.lambda.advanced;

import java.util.Arrays;
import java.util.List;

import com.indus.lambda.basics.Person;

public class StreamsExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Avi", "Reddy", 24), new Person("Divya", "Reddy", 24),
				new Person("Rakesh", "Reddy", 24), new Person("Prashanth", "Kumar", 24),
				new Person("Rajesh", "Kumar", 24), new Person("Rakul Preet", "Singh", 24));

		people.stream().filter(p -> p.getLastName().startsWith("S")).forEach(p -> System.out.println(p.getFirstName()));
		
		people.parallelStream().filter(p -> p.getLastName().startsWith("S")).forEach(p -> System.out.println(p.getFirstName()));

	}

}
