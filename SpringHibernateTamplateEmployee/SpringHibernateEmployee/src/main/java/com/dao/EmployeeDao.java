package com.dao;

import com.bean.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class EmployeeDao {
    HibernateTemplate ht;

    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    @Transactional
    public int insertEmp(Employee e){
        return (int)ht.save(e);
    }

    @Transactional
    public int updateEmp(String n, float s){
        return ht.bulkUpdate("update Employee SET salary="+s+" where name ='"+n+"'");
    }

    @Transactional
    public int deleteEmp(String n)
    {
        return ht.bulkUpdate("delete from Employee where name='"+n+"'");
    }

    @Transactional
    public List<Employee> fetchEmp(){
        return ht.loadAll(Employee.class);
    }
}
