/*
File Name: Do While Loops
Author: Jim Li
Date Created: Apr. 10, 2026
Date Last Modified: Apr. 10, 2026
*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		int num = -1;
		do {
			System.out.print("Input a positive integer: ");
			num = input.nextInt();
		} while (num < 0);
		System.out.println(num*2);
	}

	public static void q2() {
		//Write question 2 code here
		String password, conPassword;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Input a password: ");
			password = input.nextLine();
			System.out.print("Confirm the password: ");
			conPassword = input.nextLine();
		} while (!password.equals(conPassword));
		System.out.println("success.");
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		int num, multiple;
		do {
			System.out.print("Input an integer: ");
			num = input.nextInt();
			System.out.print("Input an integer that is a multiple of the first integer: ");
			multiple = input.nextInt();
		} while (multiple % num != 0);
		System.out.println("success.");
	}
}
