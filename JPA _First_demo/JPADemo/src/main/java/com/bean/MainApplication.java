package com.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class MainApplication {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gita");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        //inserting
        /*
        Student stu = new Student();

        stu.setName("Utkarsh");
        stu.setPercentage(93.90f);
        System.out.println(stu);
        */

        //updating value
        /*
        Student stu1= new Student();
        stu1.setR_no(2);
        stu1.setName("Utkarsh");
        stu1.setPercentage(97.8f);
        entityManager.merge(stu1);
        System.out.println(stu1);
        */

        //finding an entity i.e fetching values

        /*
        Student stu2 = entityManager.find(Student.class,2);
        System.out.println(stu2);

         */

        //Executing a query
        /*
        String sql = "Select name from Student name where name.r_no=3";
        Query query = entityManager.createQuery(sql);
        Student stu3 = (Student) query.getSingleResult();
        System.out.println(stu3);
*/
        //

        //Removing an entity instance;

        Student stu4 = entityManager.getReference(Student.class,3);
        entityManager.remove(stu4);



        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
