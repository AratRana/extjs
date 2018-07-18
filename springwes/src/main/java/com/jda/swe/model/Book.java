package com.jda.swe.model;

public class Book {
	private int id;
	private String title;
	private String author;
	private int price;
	private int qty;

	public Book() {
	}

	public Book(int id, String title, String author, int price, int qty) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.setQty(qty);
	}

	// getter-setters goes here...

	@Override
	public String toString() {
		return String.format("Book [title = %s, author = %s]", title, author);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
