package edu.kampusdaring.application;

import edu.kampusdaring.domain.Book;
import edu.kampusdaring.domain.Customer;

public class BookApp {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "Kampus Daring", 20.0, 10);
		
		Book book2 = new Book("Web Programming", "Sun Microsystem", 30.0, 20);
		
		System.out.println(book1.detailBook());
		
		System.out.println(book2.detailBook());
		
		System.out.println(Book.coverType());
		
		
		Customer bejo = new Customer("Bejo", "Indonesia", "01234566800");
		System.out.println(bejo.introduce());
		System.out.println(bejo.callMe());
		
		Customer joko = new Customer("Joko", "Bali, Indonesia", "+62911");
		System.out.println(joko.introduce());
		System.out.println(joko.callMe());
		
		joko.setName("Anwar");
		joko.setAddress("Jogja");
		System.out.println(joko.introduce());
		
	}

}
