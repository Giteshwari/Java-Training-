package com.bean;

import java.util.List;

public class Doctors {
    private int doc_id;
    private String doc_name;
    private float experience;
    private String Specialization;
    private String type_emp;
    private String ph_no;
    private String shift;
    private List<Patients> patientsList;
    private List<Staff> staffList;

    public Doctors() {
        int doc_id=0;
        String doc_name="";
    }

    public Doctors(int doc_id, String doc_name, float experience, String specialization,
                   String type_emp, String ph_no, String shift, List<Patients> patientsList, List<Staff> staffList) {
        this.doc_id = doc_id;
        this.doc_name = doc_name;
        this.experience = experience;
        Specialization = specialization;
        this.type_emp = type_emp;
        this.ph_no = ph_no;
        this.shift = shift;
        this.patientsList = patientsList;
        this.staffList = staffList;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getType_emp() {
        return type_emp;
    }

    public void setType_emp(String type_emp) {
        this.type_emp = type_emp;
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

    public List<Patients> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patients> patientsList) {
        this.patientsList = patientsList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
