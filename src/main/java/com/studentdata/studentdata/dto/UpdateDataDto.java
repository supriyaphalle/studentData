package com.studentdata.studentdata.dto;


// import javax.validation.constraints.Min;
// import javax.validation.constraints.NotNull;
// import javax.validation.constraints.Size;
public class UpdateDataDto {
    
    //@Min(value = 1,message = "Roll number must be greater than 0")
   // @NotNull(message= "Roll number should not be empty")
    public int rollNumber;

    //@Min(value = 15, message ="Marks must be greater than 15)
    //@NotNull(message = " marks should not be null")
    public int marks;

}
