package com.jda.swe.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jda.swe.model.Book;

@Component
public interface BookDao {

	public boolean addBook(Book book);

	public void updateBook(Book book);

	public List<Book> listBooks();

	public Book getBookById(Integer bookId);

	public boolean removeBook(Book book);
}