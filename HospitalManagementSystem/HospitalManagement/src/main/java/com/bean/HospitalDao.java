package com.bean;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class HospitalDao {

    static Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");

    public static List<Patients> fetch(String blood_type){
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Patients.class);
        criteria.add(Restrictions.eq("blood_type",blood_type));

        return criteria.list();

    }
}
