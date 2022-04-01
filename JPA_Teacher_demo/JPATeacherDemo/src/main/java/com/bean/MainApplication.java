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
        
        
        
        System.out.println("**********Aggregate*****");

        System.out.println("*********Min***********");
        Query query1 =em.createQuery("Select MIN(e.salary) from Teacher e");
        Double result =(Double) query1.getSingleResult();
        System.out.println("Min Teacher Salary:"+result);

        System.out.println("**********MAX*****");
        Query query4 =em.createQuery("Select MAX(e.salary) from Teacher e");
        Double result1 =(Double) query4.getSingleResult();
        System.out.println("Max Teacher Salary:"+result1);


        System.out.println("**********Like*******");

        Query query2 = em.createQuery("select t from Teacher t where t.name LIKE 'G%' ");
        List<Teacher> list3 =(List<Teacher>) query2.getResultList();
        for (Teacher tea:list3)
              {
                  System.out.println("teacher_name:    "+tea.getName());
              }


        System.out.println("**********Between *************");
        Query query3 = em.createQuery("select b from Teacher b where b.salary BETWEEN 8000 AND 80000 ");
        List<Teacher> list4 =(List<Teacher>) query3.getResultList();
        for (Teacher t1:list4)
        {
            System.out.println(t1);
        }

    }
}
