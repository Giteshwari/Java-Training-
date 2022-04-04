package com.bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Staff {
    private int st_id;
    private String st_name;
    private String qualification;
    private float experience;
    private String ph_no;
    private String shift;

    public Staff(int st_id, String st_name, String qualification, float experience,String ph_no, String shift) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.qualification = qualification;
        this.experience = experience;
        this.ph_no = ph_no;
        this.shift = shift;
    }

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

}
