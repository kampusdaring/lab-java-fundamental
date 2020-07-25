package edu.kampusdaring.employee;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		//input book title
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter book's title :");
		
		//match title? 
		String desiredBookTitle = "Java";
		boolean incorrectBook = true;
		
		while (incorrectBook) {
			String bookTitleRequested = scanner.next();
			if(desiredBookTitle.equalsIgnoreCase(bookTitleRequested)) {
				incorrectBook = false;
			}		
		}
		
		
		//buy the book
		System.out.println("Horray, you got your book " + desiredBookTitle);
	}

}
