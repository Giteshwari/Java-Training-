package com.dao;

import com.bean.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDao {
    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "jt=" + jt +
                '}';
    }

    public int insertBook(Book b)
    {
        String sql = "insert into JTBookDetails values(?,?,?,?)";
        Object[] values = {b.getBid(), b.getBookName(), b.getAuthorName(), b.getPrice()};
        System.out.println("New Record Added");
        return jt.update(sql,values);
    }

    public int updateBook(String bn,float p){
        String sql="update JTBookDetails set Price ='"+p+"' where bookName ='"+bn+"'";
        return jt.update(sql);
    }

    public int deleteBook(String bn){
        String sql ="delete from JTBookDetails where bookName ='"+bn+"'";
        return jt.update(sql);
    }
    public List<Book> fetchAllBooks()
    {
        String sql = "select * from JTBookDetails";

        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }

    public List<Book> fetchByName(String bn) {
        String sql ="select * from JTBookDetails where bookName ='"+bn+"' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setBid(resultSet.getInt(1));
                book.setBookName(resultSet.getString(2));
                book.setAuthorName(resultSet.getString(3));
                book.setPrice(resultSet.getFloat(4));
                return book;
            }
                }
        );
        return bookList;
    }

    public List<Book> fetchbet(float p1, float p2) {

        String sql ="select * from JTBookDetails where price BETWEEN '"+p1+"' AND '"+p2+"' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }

    public List<Book> fetchlike() {

        String sql ="select * from JTBookDetails where authorName Like 'a%' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }



}


