package com.shubham;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		int a=sc.nextInt();
		System.out.print("Enter b value:");
		int b= sc.nextInt();
		System.out.println("sum:"+(a+b));
		System.out.println("Sub:"+(a-b));
		System.out.println("Mul:"+a*b);
		System.out.println("Div:"+a/b);
		System.out.println("Mod:"+(a%b));

	}

}
