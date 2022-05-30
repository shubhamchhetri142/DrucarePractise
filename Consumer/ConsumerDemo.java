package com.java8.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	static Consumer<Person> details = (details) -> System.out.println(details);
	static Consumer<Person> name = (details) -> System.out
			.println("Name of the person:" + details.getName().toUpperCase());
	static Consumer<Person> gender = (details) -> System.out.println("Gender:" + details.getGender().toUpperCase());
	static Consumer<Person> salary = (details) -> System.out.println("Salary:" + (details.getSalary() + 1000));
	static List<Person> list = PersonRepository.getAllPersons();

	public static void main(String[] args) {
		printWithCondition();
	}

	public static void printWithCondition() {
		list.forEach(per -> {
			if (per.getGender() == per.getGender() && per.getName() == per.getName()) {
				details.accept(per);
				name.accept(per);
				gender.accept(per);
				salary.accept(per);
			}
		});
	}

}