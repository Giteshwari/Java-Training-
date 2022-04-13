package com.example.SpringBootDemo.Repository;

import java.util.List;

import com.example.SpringBootDemo.Model.Book;

public interface BookRepository {
	
	public int insertBook(Book b);
	public int updateBook(String bn,float p);
	public void deleteBook(int bid);
	public List<Book> getAllBooks();
	
	
	
	

}
