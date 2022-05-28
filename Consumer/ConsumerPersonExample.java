package com.java8.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {
	static Consumer<Person> c1 = (per) -> System.out.println(per);

	static Consumer<Person> c2 = (per) -> System.out.println(per.getName().toUpperCase());
	static List<Person> list = PersonRepository.getAllPersons();

	public static void main(String[] args) {
		printWithCondition();
	}

	public static void printWithCondition() {
		list.forEach(per -> {
			if (per.getGender() == "Male" && per.getHeight() >= 140) {
				c1.andThen(c2).accept(per);
			}
		});
	}

}