package com.mahder.librarymanagement.service;

import java.util.List;

import com.mahder.librarymanagement.model.Book;

public interface BookService {
	public void saveBook(Book book);
	public void deleteBook(Long id);
	public List<Book> listBooks();
	public Book getBook(Long id);
}//end interface
