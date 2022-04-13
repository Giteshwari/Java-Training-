package com.example.SpringBootDemo.Repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.Model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository{
	
	@Autowired
	private EntityManager em;
	
	
	@Override
	public int insertBook(Book b) {
		Session s = em.unwrap(Session.class);
		return (int) s.save(b);
	}

	@Override
	public int updateBook(String bn, float p) {
		Session s = em.unwrap(Session.class);
		Query query = s.createQuery("update Book set price = :x where bookName= :y");
		query.setParameter("x", p);
		query.setParameter("y", bn);
		
		return query.executeUpdate();
	}

	@Override
	public void deleteBook(int bid) {
		Session s = em.unwrap(Session.class);
		Book b = s.get(Book.class, bid);
		s.delete(b);
		
		
	}

	@Override
	public List<Book> getAllBooks() {
		Session s = em.unwrap(Session.class);
		Query query = s.createQuery("from Book");
		return query.getResultList();
	}
	

}
