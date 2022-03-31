package com.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Iterator;
import java.util.List;

public class MainApplication
{
    public static void main( String[] args )
    {
        EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("Gita");
        EntityManager em=emfactory.createEntityManager();
        CriteriaBuilder  cb =em.getCriteriaBuilder();
        CriteriaQuery<Object> cq= cb.createQuery();

        em.getTransaction().begin();

        Root<Teacher> from=cq.from(Teacher.class);
        Teacher t=new Teacher();
//        t.setName("Gita");
//        t.setSalary(87000);
//        t.setDeg("abc");
        t.setName("Sita");
        t.setSalary(87000);
        t.setDeg("bcd");
        em.persist(t);



        System.out.println("Select all records from teacher");
        CriteriaQuery<Object> select=cq.select(from);
        TypedQuery<Object> tq=em.createQuery(select);
        List<Object> resultlist=tq.getResultList();

        for(Object o:resultlist){
            Teacher t1=(Teacher)o;
            System.out.println(t1.getName()+" "+t1.getDeg()+" "+t1.getSalary());

        }

        System.out.println("**********fetching multiple columns*******");
        CriteriaQuery<Object> multiselect = cq.multiselect(from.get("name"),from.get("salary"));
        TypedQuery<Object> typedQuery1 = em.createQuery(multiselect);
        List<Object> list1 = typedQuery1.getResultList();

        Iterator it = list1.iterator();

        while (it.hasNext()){
            Object obj[] = (Object[])it.next();
            System.out.println(obj[0]+"-------->"+obj[1]);
        }


        System.out.println("*********Descending********** ");
        CriteriaQuery<Object> descending =cq.orderBy(cb.desc(from.get("name")));
        TypedQuery<Object> typedQuery = em.createQuery(descending);
        List<Object> list = typedQuery.getResultList();

        Iterator it1 = list.iterator();
        while(it1.hasNext()){
            Object obj[] =(Object[])it1.next();
            System.out.println(obj[0]+"-------->"+obj[1]);
        }

        em.getTransaction().commit();

    }
}