package com.programpractice.practice;

public class Array {
	public static void main(String args[]){
		String a[] = new String[] { "a", "b", "c", "d" };
		String b[] = new String[] { "a", "b", "c", "d", "e", "f", "g" };

		int c=0;
		for (int i=0; i<a.length; i++) {
			   if (a[i] == (b[i])) {
			       c += 1;
			   }
			}
			System.out.println("The number of elements that are equal is " + c);
	}
}
