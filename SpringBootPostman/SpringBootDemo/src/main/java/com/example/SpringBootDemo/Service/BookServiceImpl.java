package com.example.SpringBootDemo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.Model.Book;
import com.example.SpringBootDemo.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	@Transactional
	@Override
	public int insertBook(Book b) {
		// TODO Auto-generated method stub
		return bookRepository.insertBook(b);
	}

	@Transactional
	@Override
	public int updateBook(String bn, float p) {
		// TODO Auto-generated method stub

		return bookRepository.updateBook(bn, p);

	}

	@Transactional
	@Override
	public void deleteBook(int bid) {
		// TODO Auto-generated method stub
		bookRepository.deleteBook(bid);

	}

	@Transactional
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBooks();
	}


}