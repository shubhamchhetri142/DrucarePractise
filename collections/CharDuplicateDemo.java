package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharDuplicateDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Data:");
			String name = sc.nextLine();
			char[] charArray = name.toCharArray();
			HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
			for (char txt : charArray) {
				if (characterMap.containsKey(txt)) {
					characterMap.put(txt, characterMap.get(txt) + 1);

				} else {
					characterMap.put(txt, 1);
				}
			}
			System.out.println(characterMap);
			Set<Map.Entry<Character, Integer>> data = characterMap.entrySet();
			for (Map.Entry<Character, Integer> characterData : data) {
				if (characterData.getValue() > 1) {
					System.out.println("Duplicates are:" + characterData);
				}
			}
		}
	}

}
