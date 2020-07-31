package edu.kampusdaring.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import edu.kampusdaring.domain.Book;
import edu.kampusdaring.domain.Customer;

public class BookApp {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		//database
		List<Book> books = getBookList();
		
		System.out.println(books.size());
		System.out.println(books.get(1));
		
		Book politic = new Book("Politic", "Democration", "kampusdaring");
		books.add(politic);
		
		System.out.println(books.size());
		
		String keyword = "Programming";
		
		List<Book> result = books.stream().filter(book -> book.getTitle().contains(keyword)).collect(Collectors.toList());
		
		System.out.println(result.size());
		for (Book bookInCart : result) {
			System.out.println(bookInCart);
		}

		//database customer
		List<Customer> customers = getCustomers();
		
		
		Customer singleResult = customers.stream().findFirst().filter(customer -> customer.getId().equals(101l)).get();
		System.out.println(singleResult);
		
		
		//Log O(n) //list
		
		//map Log O(1)
		Map<String, Book> bookMap = getBookMap();
		
		System.out.println("Map size : "+ bookMap.size());
		System.out.println("original : " + bookMap.get("ORACLE_DB"));
		
		bookMap.replace("ORACLE_DB", new Book("My SQL BOOK", "my sql db", "kampus daring"));
		System.out.println("after replace : " + bookMap.get("ORACLE_DB"));

		
	}

	private static Map<String, Book> getBookMap() {
		Map<String, Book> bookMap = new HashMap<>();
		Book javaProgramming = new Book("Java Programming", "Fundamental", "kampus daring");
		Book webProgramming = new Book("Web Programming", "Essential", "gramedia");
		Book database = new Book("Oracle DB", "Essential", "oracle");
		bookMap.put("JAVA", javaProgramming);
		bookMap.put("WEB", webProgramming);
		bookMap.put("ORACLE_DB", database);
		bookMap.put("ORACLE_DB", javaProgramming);
		return bookMap;
	}

	private static List<Customer> getCustomers() {
		Customer bejo = new Customer(101l, "Bejo", "Supervisor");
		Customer tukijo = new Customer(102l, "Tukijo", "CEO");
		List<Customer> customers = Arrays.asList(bejo, tukijo);
		return customers;
	}

	private static List<Book> getBookList() {
		Book javaProgramming = new Book("Java Programming", "Fundamental", "kampus daring");
		Book webProgramming = new Book("Web Programming", "Essential", "gramedia");
		Book database = new Book("Oracle DB", "Essential", "oracle");
		
		List<Book> books = new ArrayList<Book>();
		books.add(javaProgramming);
		books.add(webProgramming);
		books.add(database);
		return books;
	}

	private static Book[] getBooksArray() {
		Book javaProgramming = new Book("Java Programming", "Fundamental", "kampus daring");
		Book webProgramming = new Book("Web Programming", "Essential", "gramedia");
		Book database = new Book("Oracle DB", "Essential", "oracle");
		
		Book[] books = {javaProgramming, webProgramming, database };
		return books;
	}

}
