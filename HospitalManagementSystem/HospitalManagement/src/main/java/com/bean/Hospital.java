package com.bean;

import java.util.List;

public class Hospital {
    private int lic_no;
    private String hos_name;
    private List<Doctors> doctorsList;


    public Hospital() {
        int lic_no=0;
        String hos_name="";
    }

    public int getLic_no() {
        return lic_no;
    }

    public void setLic_no(int lic_no) {
        this.lic_no = lic_no;
    }

    public String getHos_name() {
        return hos_name;
    }

    public void setHos_name(String hos_name) {
        this.hos_name = hos_name;
    }

    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }
}
