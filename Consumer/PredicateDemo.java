package com.java8.Consumer;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	static Predicate<Person> gender = persongender -> persongender.getGender().equals("Female");
	static Predicate<Person> salary = personsalary -> personsalary.getSalary() > 2000;
	static List<Person> details = PersonRepository.getAllPersons();

	public static void main(String[] args) {
		details.forEach(all -> {
			if (gender.and(salary).test(all))
				System.out.println(all);
		});
	}

}
