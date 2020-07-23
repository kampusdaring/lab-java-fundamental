package edu.kampusdaring.simple;

import java.util.Date;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		/*
		 * createBook("Jungle Book", "Tarzan", 20, new Date()); createBook("Java Lab 1",
		 * "Kampus Daring", 100, new Date());
		 */
		
		System.out.println("Please enter your first number to add : ");
		Scanner scanner1 = new Scanner(System.in);
		int number1 = scanner1.nextInt();
		
		System.out.println("Please enter your second number to add : ");
		scanner1 = new Scanner(System.in);
		int number2 = scanner1.nextInt();
		
		double sum = doSum(number1, number2);
		System.out.println(sum);
		
	}

	private static double doSum(int number1, int number2) {
		double result = number1 + number2;
		System.out.println("The addition result is " + result);
		
		return result; 
	}

	private static void createBook(String title, String author, int totalPage, Date publishDate) {
		System.out.println(String.format("This book %s, has %d pages, published by %s, author %s", title, totalPage, publishDate, author));
	}

}
