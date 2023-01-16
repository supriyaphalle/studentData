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
    private int id;
    
    private int rollNumber;
   
    private int marks;

   @OneToOne(cascade = CascadeType.ALL)
    private StudentInfo studentInfo;

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

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public StudentData(DataDto dataDto) {
        this.rollNumber = dataDto.rollNumber;
       this.studentInfo =  dataDto.studentInfo;
        this.marks = dataDto.marks;
    }

    public StudentData(){
        
    }
}
