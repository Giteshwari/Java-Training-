package com.bean;

import com.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao dao = (EmployeeDao) ap.getBean("dao");
        System.out.println("Updated!!");

        Employee e = new Employee();

        e.setName("Saurabh");
        e.setDesignation("java ");
        e.setSalary(80000);
//        dao.insertEmp(e);
//        dao.deleteEmp("Gita");
//        dao.updateEmp("Saurabh",90000);


        List<Employee> emplist = dao.fetchEmp();
        for (Employee emp : emplist) {
            System.out.println(emp);

        }

    }
}
