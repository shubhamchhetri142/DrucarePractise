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
		List<String> startsc = citynames.stream().filter(names -> names.startsWith("C"))
				.map(names -> names.toUpperCase()).collect(Collectors.toList());
		System.out.println(startsc);
		List<String> contains = citynames.stream().filter(names -> names.contains("ai"))
				.map(names -> names.toLowerCase()).collect(Collectors.toList());
		System.out.println(contains);
//		List<String> append = citynames.stream().filter(names -> names.concat("Metro"))
//				.map(names -> names.toUpperCase()).collect(Collectors.toList());
		List<String> sort = citynames.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		long count = citynames.stream().filter(names -> names.length() > 0).count();
		System.out.println(count);
		// List<String>
		// first=citynames.stream().findFirst().map(names->names.toLowerCase())
	}

}
