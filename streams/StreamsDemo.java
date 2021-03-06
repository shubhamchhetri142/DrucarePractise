package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> citynames = Arrays.asList("Hyderabad", "Delhi", "Dehradun", "Chennai", "Bangalore", "Chicago",
				"Jaipur", "Vasai virar");
		List<String> outputlist = citynames.stream().map(names -> names.toUpperCase()).collect(Collectors.toList());
		System.out.println(outputlist);
		List<String> listoutput = citynames.stream().filter(names -> names.length() > 6)
				.map(names -> names.toUpperCase()).collect(Collectors.toList());
		System.out.println(listoutput);
		List<String> startsclist = citynames.stream().filter(names -> names.startsWith("C"))
				.map(names -> names.toUpperCase()).collect(Collectors.toList());
		System.out.println(startsc);
		List<String> containslist = citynames.stream()
				.map(names -> names.concat(" Metro")).collect(Collectors.toList());
		System.out.println(contains);
		List<String> appendlist = citynames.stream().filter(names -> names.concat("Metro"))
				.map(names -> names.toUpperCase()).collect(Collectors.toList());
		System.out.println(appendlist);
		List<String> sortlist = citynames.stream().sorted().collect(Collectors.toList());
		System.out.println(sortlist);
		long countlist = citynames.stream().filter(names -> names.length() > 0).count();
		System.out.println(countlist);
		List<String> firstlist=citynames.stream().findFirst().get();
		System.out.println(firstlist);
	}

}
