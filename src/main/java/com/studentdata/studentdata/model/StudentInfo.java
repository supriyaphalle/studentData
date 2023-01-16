package com.studentdata.studentdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private String studentName;
    private String gender;
    private String address;

    
    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public StudentInfo(){

    }

    public StudentInfo(String studentName, String gender, String address) {
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
    }
}
