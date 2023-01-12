package com.studentdata.studentdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.studentdata.studentdata.dto.DataDto;

import javax.persistence.*;

@Entity
@Table(name="studentData")
public class StudentData {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNumber;
    private String studentName;
    private String gender;
    private String address;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

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

    public StudentData(DataDto dataDto) {
        this.rollNumber = dataDto.rollNumber;
        this.studentName = dataDto.studentName;
        this.gender = dataDto.gender;
        this.address = dataDto.address;
        this.marks = dataDto.marks;
    }

    public StudentData(){
        
    }
}
