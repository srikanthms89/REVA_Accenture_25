package com.tnsif.day2;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("enter age ");
		age = sc.nextInt();
		
		if(age >=18)
			System.out.println("Eligible for voting");
		else
			System.out.println("Not eligible ");
		
	}

}
