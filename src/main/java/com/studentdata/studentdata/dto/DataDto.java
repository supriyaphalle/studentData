package com.studentdata.studentdata.dto;

// import javax.validation.constraints.Min;
// import javax.validation.constraints.NotEmpty;
// import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Size;
public class DataDto {

   
    public int rollNumber;
    public String studentName;
    public String gender;
    public String address;
    public int marks;

    
    public DataDto() {
    }


    public DataDto(int rollNumber, String studentName, String gender, String address, int marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.marks = marks;
    }


    
}
