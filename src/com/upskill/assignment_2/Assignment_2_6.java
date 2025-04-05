package com.upskill.assignment_2;

public class Assignment_2_6 {

	/*
	 * Problem 6. Write a java program to find the prime number from 1 to 100
	 * and print them.
	 */

	public static void main(String[] args) {
		primeNumber();
	}

	public static void primeNumber() {
		for (int i = 1; i <= 100; i++) {

			if (i == 3 || i == 5 || i == 7) {
				System.out.println(i + " prime numb");
			}

			else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				System.out.println(i + " not a prime numb");
			} else

			{
				System.out.println(i + " prime numb");
			}
		}
	}
}
