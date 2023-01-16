package com.studentdata.studentdata.dto;

import javax.validation.constraints.NotNull;

import com.studentdata.studentdata.model.StudentInfo;

import javax.validation.constraints.Min;
// import javax.validation.constraints.NotEmpty;
// import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Size;
public class DataDto {

    @Min(value = 1,message = "Roll number must be greater than 0")
    @NotNull(message= "Roll number should not be empty")
    public int rollNumber;

    // @NotNull(message = "Student name should not be null")
    // public String studentName;

    // @NotNull(message = "Gender should not be null")
    // public String gender;

    // @NotNull(message = "Address should not be null")
    // public String address;

    @NotNull(message = "Marks should not be null")
    public int marks;
    
    @NotNull(message = "Student data not null")
    public StudentInfo studentInfo;

    public DataDto() {
        
    }

    public DataDto(int rollNumber, StudentInfo studentInfo, int marks) {
        this.rollNumber = rollNumber;
        this.studentInfo = studentInfo;
        this.marks = marks;
    }    
}
