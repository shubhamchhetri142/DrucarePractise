package com.shubham;

import java.util.Scanner;

public class Same {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a and b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("Equals.");
		}
		else {
			System.out.println("Not Equals.");
		}

	}

}
