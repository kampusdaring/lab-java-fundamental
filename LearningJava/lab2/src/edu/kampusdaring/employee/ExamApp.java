package edu.kampusdaring.employee;

import java.util.Scanner;

public class ExamApp {

	private static final String EXPECTED_USER = "bejo";
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Please enter user name :");

		boolean isNotValidUser = true;

		String userName = "";

		// expected user=bejo
		while (isNotValidUser) {
			userName = scanner.next();
			if (EXPECTED_USER.equalsIgnoreCase(userName)) {
				isNotValidUser = false;
			}
			System.out.println("Please try again to enter valid user name :");

		}

		System.out.println("**************************************************");
		
		// valid user?
		System.out.println("Welcome to exam app, " + userName);

		// do exam
		System.out.println("Please answer following questions. Put a character as your answer instead of full answer, for example : A, B or C");
		int question1 = doQuestion1();
		int question2 = doQuestion2();
		int question3 = doQuestion3();

		// result = result > 75% ? pass : fail
		double result = (question1 + question2 + question3) / 3;
		if(result >= 0.75) {
			System.out.println("Congratulations " + userName + ", you have passed the test :)");
		} else {
			System.out.println("Aww :(, sorry you have failed the test");
		}
		
	}

	private static int doQuestion1() {
		System.out.println("Question 1 : Who is current president of Indonesia?");
		System.out.println(" A. Joko Widodo \n B. Prabowo Subianto \n C. Sule \nYour answer :");
		scanner = new Scanner(System.in);
		String answer = scanner.next();
		if("A".equalsIgnoreCase(answer)) {
			return 1;
		}
		return 0;
	}
	
	private static int doQuestion2() {
		System.out.println("Question 2 : What is capital of Indonesia?");
		System.out.println(" A. Surabaya \n B. Papua \n C. Jakarta \nYour answer :");
		scanner = new Scanner(System.in);
		String answer = scanner.next();
		if("C".equalsIgnoreCase(answer)) {
			return 1;
		}
		return 0;
	}
	
	private static int doQuestion3() {
		System.out.println("Question 3 : Who is providing this Java Lab training?");
		System.out.println(" A. Oracle \n B. Microsoft \n C. Kampus Daring \nYour answer :");
		scanner = new Scanner(System.in);
		String answer = scanner.next();
		if("C".equalsIgnoreCase(answer)) {
			return 1;
		}
		return 0;
	}

}
