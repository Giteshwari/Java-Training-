package com.bean;

import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
        BookDao d = (BookDao) ap.getBean("dao");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch;
        do{
            System.out.println("1.Insert\n2.Update\n3.Delete\n4.FetchAllBooks\n6.Exit");
            System.out.println("Your Choice: ");
            ch = Integer.parseInt(br.readLine());

            switch(ch){
                case 1:
                    System.out.println("Enter Bn,An,price");
                    String bn=br.readLine();
                    String an = br.readLine();
                    float p = Float.parseFloat(br.readLine());
                    Book b = new Book();
                    b.setBookName(bn);
                    b.setAuthorName(an);
                    b.setPrice(p);
                    d.insertBook(b);
                    break;
                case 2:
                    System.out.println("Update price using Book name");
                    float price = Float.parseFloat(br.readLine());
                    String name = br.readLine();
                    d.updateBook(name,price);
                    break;

                case 3:
                    System.out.println("Delete record using Book Name");
                    String bname = br.readLine();
                    d.deleteBook(bname);
                    break;
                case 4:
                    System.out.println("Fetching Books");
                    List<Book> results = d.fetchAllBooks();
                    for (Book b1 : results) {
                        System.out.println(b1);
                    }
                    break;
                case 6:
                    System.out.println("Thank You !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter correct Choice");

            }



          }

        while(true);




    }
}
