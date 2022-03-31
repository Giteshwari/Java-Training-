package com.bean;
import com.dao.BookDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        String bookn,authurn;
        float bprice;
        int bid,ch,i;
        Book b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            Configuration configuration=new Configuration().configure("Hibernate.cfg.xml");
            SessionFactory sessionFactory=configuration.buildSessionFactory();


            System.out.println("1.Insert\n ");
            System.out.println("Enter Your Choice:");
            ch = Integer.parseInt((br.readLine()));

            switch (ch){

                case 1:
                    Session session = configuration.buildSessionFactory().openSession();
                    Transaction transaction = session.beginTransaction();
                    System.out.println("Enter Book id, name, price, author");
                    Library l = new Library();
                    l.setId(1);

                    bid=Integer.parseInt(br.readLine());
                    bookn = br.readLine();
                    bprice = Float.parseFloat(br.readLine());
                    authurn = br.readLine();
                    List<Book> b1 = new ArrayList<>();
                    b1.add(new Book(bid,bookn,authurn,bprice));
                    l.setBooks((Set<Book>) b1);
                    session.save(l);
                    transaction.commit();
                    break;

                case 2:
                    System.out.println("Fetch Book Details");
                    Session session1 = configuration.buildSessionFactory().openSession();
                    Transaction transaction1 = session1.beginTransaction();
                    Query q = session1.createQuery("from Book");
                    List list = q.getResultList();
                    for (Object o:list){
                        System.out.println(o);
                    }





                default:
                    System.out.println("Enter proper choice");

            }






        }
        catch(Exception e){
            System.out.println(e);
        }







    }
}



