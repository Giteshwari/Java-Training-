package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        try {

            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int ch;
            String blood;
            List<Patients> pl;

            do {
                System.out.println("ENTER YOUR CHOICE:");
                System.out.println("1.Insert details\n2.fetch patient's list with blood type\n3.exit");
                ch = Integer.parseInt(br.readLine());
                switch (ch) {
                    case 1:
                        Hospital hospital = new Hospital();
                        hospital.setLic_no(101);//1
                        hospital.setHos_name("Shree");//2

                        List<Staff> list6_10 = new ArrayList<>();
                        list6_10.add(new Staff(201, "Rina", "Nursing", 3.0f, "9876543210", "6-2"));
                        list6_10.add(new Staff(202, "Tina", "Nursing", 2f, "8767568758", "2-10"));

                        List<Staff> ostlist = new ArrayList<>();
                        ostlist.add(new Staff(203, "Raju", "Nursing", 5.0f, "8765453423", "10-6"));


                        List<Patients> list300 = new ArrayList<>();
                        list300.add(new Patients(301, "A", "6754784389", "A +ve", " 27/02/2022", "4/10/2022"));
                        list300.add(new Patients(302, "B", "8712233445", "B +ve", "6/09/2021", "15/05/2022"));

                        List<Patients> odoclist = new ArrayList<>();
                        odoclist.add(new Patients(303, "C", "8097897656", "O +ve", "5/07/2021", "14/03/2022"));

                        List<Patients> odoclist2 = new ArrayList<>();
                        odoclist2.add(new Patients(304, "D", "6545367800", "A +ve", "9/03/2022", "18/11/2022"));

                        List<Doctors> list400 = new ArrayList();
                        list400.add(new Doctors(401, "Malti", 4.5f, "Gynecologist", "full-time",
                                "9988776655", "2-10", list300, list6_10));
                        list400.add(new Doctors(402, "Manohar", 3f, "pediatrician", "Full-time",
                                "9087676545", "12-6", odoclist, ostlist));
                        list400.add(new Doctors(403, "Anil", 7f, "Anaesthetist", "Part-time",
                                "9090908070", "6-10", list300, list6_10));

                        hospital.setDoctorsList(list400);//3

                        session.save(hospital);

                        transaction.commit();

                        break;

                    case 2:

                        System.out.println("Enter blood type:");
                        blood = br.readLine();
                        pl = HospitalDao.fetch(blood);
                        for (Patients p : pl) {
                            System.out.println(p);
                        }
                        break;

                    case 3:
                        System.out.println("Thanks for using our Application");
                        System.exit(0);

                    default:
                        System.out.println("Enter proper choice");
                }


            }
            while (true);
        }

            catch(Exception e){
                System.out.println(e);
            }

        }


    }


