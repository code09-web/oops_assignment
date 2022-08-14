package com.book;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book number:-");
		int bookNo = sc.nextInt();
		System.out.println("Enter Title of book:-");
		String title = sc.nextLine();
		System.out.println("Enter book auther name");
		String author = sc.nextLine();
		System.out.println("Enter book price");
		float price = sc.nextFloat();
		book.setBookNo(bookNo);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
	}

}
