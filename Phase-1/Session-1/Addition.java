package com.simplilearn;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner object= new Scanner(System.in); //creating object to use a class
		System.out.println("Enter Number 1");
		num1= object.nextInt();
		System.out.println("Enter another number");
		num2= object.nextInt();
		
		int result= num1+num2; //+, -, *, / arithmetic operator
		System.out.println("Addition is "+result);
	}
}
