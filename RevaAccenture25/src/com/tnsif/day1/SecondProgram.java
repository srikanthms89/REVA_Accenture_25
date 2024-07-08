package com.tnsif.day1;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {

         int firstNumber ;
         int secondNumber;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the first number");
         firstNumber= sc.nextInt();
         System.out.println("Enter the Second number");
         secondNumber = sc.nextInt();
         int result = firstNumber + secondNumber ;
         System.out.println("Addition of two numbers" +result);

	}

}
