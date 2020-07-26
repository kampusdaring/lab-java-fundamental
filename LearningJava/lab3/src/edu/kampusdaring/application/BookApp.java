package edu.kampusdaring.application;

import edu.kampusdaring.domain.Book;

public class BookApp {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "Kampus Daring", 20.0, 10);
		
		Book book2 = new Book("Web Programming", "Sun Microsystem", 30.0, 20);
		
		System.out.println(book1.detailBook());
		
		System.out.println(book2.detailBook());
		
		System.out.println(Book.coverType());
	}

}
