package com.bean;

import com.dao.MovieDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        MovieDao movieDao = (MovieDao) applicationContext.getBean("dao");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int ch;

        do{
            System.out.println("1.Insert Movie\n2.Update Collection\n3.delete\n4.Fetch All Movies\nExit");
            System.out.println("Enter Your Choice: ");
            ch = Integer.parseInt(bufferedReader.readLine());

            switch (ch)
            {
                case 1:
                    System.out.println("Enter Movie id, name , director name and collection of movie");
                    String name = bufferedReader.readLine();
                    String director = bufferedReader.readLine();
                    float collection = Float.parseFloat(bufferedReader.readLine());
                    Movie m = new Movie();
                    m.setName(name);
                    m.setDirector_name(director);
                    m.setCollection(collection);
                    movieDao.insertMovie(m);
                    break;

                case 2:
                    System.out.println("Enter the name and updated collection");
                    String name1 = bufferedReader.readLine();
                    float collection1 = Float.parseFloat(bufferedReader.readLine());
                    movieDao.UpdateCollection(name1,collection1);
                    break;

                case 3:
                    System.out.println("Enter the name of the movie which u want to delete ");
                    String name2 = bufferedReader.readLine();
                    movieDao.deleteMovie(name2);
                    break;

                case 4:
                    System.out.println("All the Movies in the table are: ");
                    List<Movie> movies = movieDao.fetchAllMovies();
                    for (Movie movie :movies) {
                        System.out.println(movie);
                    }
                    break;

                case 5:
                    System.out.println("Thank You !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter correct Choice");



            }




        }
        while(true);


    }
}
