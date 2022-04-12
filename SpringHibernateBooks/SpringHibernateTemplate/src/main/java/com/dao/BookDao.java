package com.dao;

import com.bean.Book;
import org.springframework.orm.hibernate5.HibernateTemplate;
import javax.transaction.Transactional;
import java.util.List;

public class BookDao {
    private HibernateTemplate ht;


    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    @Transactional
    public int insertBook(Book b) {
        return (int) ht.save(b);
    }


    @Transactional
    public int updateBook(String n, float p) {
        return ht.bulkUpdate("update Book SET price=" + p + " where bookName ='" + n + "'");
    }

    @Transactional
    public int deleteBook(String n) {
        return ht.bulkUpdate("delete from Book where bookName='" + n + "'");
    }

    @Transactional
    public List<Book> fetchAllBooks() {
        return ht.loadAll(Book.class);
    }

}



