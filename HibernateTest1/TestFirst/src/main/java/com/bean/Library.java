package com.bean;

import java.util.Set;

public class Library {
    private int id;
    private Set<Book> books;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", books=" + books +
                '}';
    }
}
