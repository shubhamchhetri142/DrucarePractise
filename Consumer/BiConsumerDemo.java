package com.java8.Consumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	static BiConsumer<String, String> listhobbies = (name, hobbies) -> System.out
			.println("Name:" + name + "     " + "Hobbies:" + hobbies.toUpperCase());
	static List<Person> listperson = PersonRepository.getAllPersons();

	static void getHobbies() {
		listperson.forEach((details) -> {
			details.getHobbies().forEach((hobbies) -> {
				listhobbies.accept(details.getName(), hobbies);
			});
		});
	}

	static BiConsumer<String, Double> income = (name, salary) -> System.out
			.println("Name: " + name + "     " + "salary:" + (salary + 1000));

	static void getSalary() {
		listperson.forEach((details) -> {
			income.accept(details.getName(), details.getSalary());
		});
	}

	public static void main(String[] args) {
		getHobbies();
		getSalary();

	}

}
