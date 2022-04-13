package com.example.SpringBootDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemo.Model.Book;
import com.example.SpringBootDemo.Service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(path="/save")
	public String saveController(@RequestBody Book b) {
		int i = bookService.insertBook(b);
		if(i>0)
			return "Record Added Successfully";
		else
			return "Something Went Wrong";
	}
		
	//Update 
	@PutMapping(path="update/{bookName}/{price}")
	public String updateController(@PathVariable String bookName,@PathVariable float price) {
		bookService.updateBook(bookName, price);
		return "Data Updated Successfully";
	}
	
	//delete 
	@DeleteMapping(path="delete/{bid}")
	public String deleteController(@PathVariable int bid) {
		bookService.deleteBook(bid);
		return "Data Deleted Successfully";
	}
	
	//getAll
	@GetMapping(path="getAllBooks")
	public List<Book> ftechController(){
		return bookService.getAllBooks();
	}
}
