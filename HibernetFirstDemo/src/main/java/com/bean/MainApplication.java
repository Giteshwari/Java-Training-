package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApplication  {
    public static void main(String[] args)  {
        //configuration
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Book book = new Book();
        book.setBook_name("Wings of Fire");
        book.setAuthor_name("A.P.J.Abdul Kalam");
        book.setPrice(800.98f);

        book.setBook_name("Immortals of Meluha");
        book.setAuthor_name("Amish Tripathi");
        book.setPrice(750.09f);


        session.save(book);
        transaction.commit();
        System.out.println("record added successfully!!");



    }
}
