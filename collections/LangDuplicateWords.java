package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LangDuplicateWords {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the string value:");
			String Lang = sc.nextLine();
			// String Lang = "Hindi English Telugu Nepali Tamil Hindi English Telugu Tamil
			// Kanada Hindi Telugu";
			HashMap<String, Integer> string = new HashMap<String, Integer>();
			String[] words = Lang.split(" ");
			for (String Language : words) {
				if (string.get(Language) == null) {
					string.put(Language, 1);
				} else {
					string.put(Language, string.get(Language) + 1);
				}

			}
			System.out.println(string);
			Set<Map.Entry<String, Integer>> stringData = string.entrySet();
			for (Map.Entry<String, Integer> data : stringData) {
				if (data.getValue() > 1) {
					System.out.println("Duplicates are:" + data);
				}
			}
		}
	}
}
