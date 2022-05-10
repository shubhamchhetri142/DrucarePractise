package com.shubham;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		int a=sc.nextInt();
		System.out.print("Enter b value:");
		int b=sc.nextInt();
		int c;
		System.out.println("Before swapping:"+a+","+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:"+ a+","+b);

	}

}
