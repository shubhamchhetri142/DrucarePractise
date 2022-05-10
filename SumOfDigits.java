package com.shubham;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		int number=0;
		int sum=0;
		while(a>0) {
			number=a%10;
			sum=number+sum;
			a=a/10;
		}
		System.out.println(sum);
		
	}

}
