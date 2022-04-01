package com.dao;

import com.bean.Teacher;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;




public class TeacherDao {
    static EntityManagerFactory emfactory= Persistence.createEntityManagerFactory("Gita");
    static EntityManager em=emfactory.createEntityManager();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void Update() throws IOException {

        em.setFlushMode(FlushModeType.COMMIT);
        List<Teacher> teachers = em.createQuery("From Teacher",Teacher.class).getResultList();

        em.getTransaction().begin();
        for(int i=0;i< teachers.size();i++){
            Teacher teacher = teachers.get(i);
            System.out.println("Enter the name to be updated");
            teacher.setName(br.readLine());
            teacher = em.merge(teacher);
            em.persist(teacher);

            int batchSize =2;
            if(i% batchSize ==0 && i>0){
                em.flush();
                em.clear();
            }

        }
        em.getTransaction().commit();



    }

    public static void DeleteRecords(float sal) throws IOException {

        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaDelete<Teacher> delete = cb.createCriteriaDelete(Teacher.class);
        Root e = delete.from(Teacher.class);
        delete.where(cb.lessThan(e.get("salary"),sal));
        em.createQuery(delete).executeUpdate();
        em.getTransaction().commit();
        System.out.println("Delete Successful");



    }
}
