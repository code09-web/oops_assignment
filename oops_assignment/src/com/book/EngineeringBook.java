package com.book;

public class EngineeringBook extends Book {
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static void main(String[] args) {

		EngineeringBook enginerBook = new EngineeringBook();
		enginerBook.setCategory("Maths");
		System.out.println(enginerBook.getCategory());

	}

}
