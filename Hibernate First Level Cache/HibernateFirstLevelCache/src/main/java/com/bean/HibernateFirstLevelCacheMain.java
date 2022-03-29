package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Andres.Cespedes
 * @version 1.0 $Date: 11/02/2015
 * @since 1.7
 *
 */
public class HibernateFirstLevelCacheMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int ID_OBJECT = 2015;
        // 1. Get one single instance of sessionFactory
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

//            Transaction transaction = session.beginTransaction();

        // 2. Open a session to do operations
        Session session = sessionFactory.openSession();
        // 3. Save an object in database.
        session.beginTransaction();
        session.save(new Department(ID_OBJECT, "Malaga"));
        session.getTransaction().commit();
        // 4. Load the previous object from 'database', really from session
        Department loaded = (Department) session.get(Department.class,
                ID_OBJECT);
        System.out.println("The Department name is: " + loaded.getName());
        // 5. Change the name to compare the object with the database entity
        loaded.setName("Madrid");
        // 6. Load again the object
        loaded = (Department) session.get(Department.class, ID_OBJECT);
        System.out.println("The Department name is: " + loaded.getName());
        // 7. Return the connection, closing the hibernate's session
        session.close();

        // 8. Open another session to do operations
        session = sessionFactory.openSession();
        // 9. Get the name to compare the Session object, after close the last
        // session
        loaded = (Department) session.get(Department.class, ID_OBJECT);
        System.out.println("The Department name is: " + loaded.getName());

        System.exit(0);
    }
}
