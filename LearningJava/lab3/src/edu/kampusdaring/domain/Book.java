package edu.kampusdaring.domain;

public class Book {
	
	static int totalPage;
	
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price, int totalPage) {
		this.title = title;
		this.author = author;
		this.price = price;
		Book.totalPage = totalPage;
	} 
	
	public String detailBook() {
		return String.format("Title :%s, author : %s, price : %s, total page :%d", title, author, price, totalPage);
	}
	
	public static String coverType() {
		return "HardCover";
	}
	
	
}
