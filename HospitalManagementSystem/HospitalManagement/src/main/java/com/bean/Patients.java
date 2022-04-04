package com.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patients {
    private int pt_id;
    private String name;
    private String ph_no;
    private String blood_type;
    private String date_of_admi;
    private String due_date;


//    Date date_of_admi1=new SimpleDateFormat("dd/MM/yyyy").parse(date_of_admi);


    public Patients(int pt_id, String name, String ph_no, String blood_type, String date_of_admi, String due_date) {
        this.pt_id = pt_id;
        this.name = name;
        this.ph_no = ph_no;
        this.blood_type = blood_type;
        this.date_of_admi = date_of_admi;
        this.due_date = due_date;
    }

    public int getPt_id() {
        return pt_id;
    }

    public void setPt_id(int pt_id) {
        this.pt_id = pt_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getDate_of_admi() {
        return date_of_admi;
    }

    public void setDate_of_admi(String date_of_admi) {
        this.date_of_admi = date_of_admi;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}
