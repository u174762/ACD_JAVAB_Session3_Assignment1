
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package com.javacoderanch.example.math;
		 
		import java.util.Scanner;
		 
		public class assignment2 {
		 
		 public static void main(String[] args) {
		 
		  // Create a Scanner object which will read
		  // values from the console which user enters
		  Scanner scanner = new Scanner(System.in);
		 
		  // Getting input from user from the console
		  System.out.println("Enter value of number for which you want Square root ");
		 
		  // Calling nextDouble method of scanner for
		  // taking a double value from user and storing
		  // it in number variable
		  double number = scanner.nextDouble();
		 
		  System.out.println();
		 
		 
		  System.out.println("Calculating Square root of a number ... ");
		 
		  // In order to calculate Square root of a number
		  // we use Math class Math.sqrt() static method which takes in a
		  // number and returns back the square root of that number
		  double result = Math.sqrt(number);
		 
		  // printing the result on the console
		  System.out.println("Square root of " + number + " is : " + result);
		 
		  System.out.println();
		 
		  // Getting input from user from the console
		  System.out.println("Enter value of number for which you want Cube root ");
		 
		  // Calling nextDouble method of scanner for
		  // taking a double value from user and storing
		  // it in number variable
		  number = scanner.nextDouble();
		 
		  System.out.println();
		 
		 
		  System.out.println("Calculating Cube root of a number ... ");
		 
		  // In order to calculate Cube root of a number
		  // we use Math class Math.cbrt() static method which takes in a
		  // number and returns back the square root of that number
		  result = Math.cbrt(number);
		 
		  // printing the result on the console
		  System.out.println("Cube root of " + number + " is : " + result);
		 
		 

		 
		}}