/**
 * 
 */
package com.mahder.librarymanagement.dao;

import java.util.List;

import com.mahder.librarymanagement.model.Book;

/**
 * @author mneway
 *
 */
public interface BookDao {
	public void saveBook(Book book);
	public List<Book> listBooks();
	public void deleteBook(Long id);
	public Book getBook(Long id);
}//end interface
