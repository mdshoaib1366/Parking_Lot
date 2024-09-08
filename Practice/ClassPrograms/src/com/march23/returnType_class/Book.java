package com.march23.returnType_class;

import java.time.LocalDate;
import java.util.Scanner;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private LocalDate publishedDate;

	public Book(String bookTitle, String bookAuthor, LocalDate publishedDate) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.publishedDate = publishedDate;
	}
	public static Book getBookObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the book title: ");
		String title = sc.nextLine();
		System.out.print("Enter the book author: ");
		String author = sc.nextLine();
		
		LocalDate date = LocalDate.now();
		
		return new Book(title, author, date);
	}
	
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", publishedDate=" + publishedDate + "]";
	}
	
}