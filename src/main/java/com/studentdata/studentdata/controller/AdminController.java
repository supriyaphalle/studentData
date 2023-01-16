package com.studentdata.studentdata.controller;
import com.studentdata.studentdata.response.Response;
import com.studentdata.studentdata.model.StudentData;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import com.studentdata.studentdata.service.StudentDataService;
import com.studentdata.studentdata.dto.DataDto;
import com.studentdata.studentdata.dto.UpdateDataDto;



@RestController
public class AdminController {
    
    @Autowired
    StudentDataService studentDataService;

    //Get all data
    @GetMapping("/data")
    public Response getData(){
        Response response=null;
        List<StudentData> list=studentDataService.getAllData();
        if(list.size()<=0){
            
            response=new Response("Data Not Present",101,list);

        }
        else{
            response=new Response("Fetched all Data", 200, list);
        }

        return response;

    }

    //Select data from table
     //retrieve the data based on user input
    @GetMapping("/data/{rollNumber}")
    public Response getData(@PathVariable("rollNumber") int rollNumber){
        return this.studentDataService.getDataByRollNumber(rollNumber);
    }

    //Add Data
    @PostMapping("/data")
    public ResponseEntity<Response> addData(@Valid @RequestBody DataDto dataDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<Response>(new Response(bindingResult.getAllErrors().get(0).getDefaultMessage(), 101, "Empty Field"),HttpStatus.BAD_REQUEST);
        }
        String responseMessage =this.studentDataService.addData(dataDto);
        return new ResponseEntity<Response>(new Response("Book Added Successfully",200, responseMessage),HttpStatus.OK);
    }    

    //Update data into table based on user input
    @PutMapping("/data")
    public ResponseEntity<Response> updateData(@Valid @RequestBody UpdateDataDto dataDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<Response>(new Response(bindingResult.getAllErrors().get(0).getDefaultMessage(), 101, "Empty Field"),HttpStatus.BAD_REQUEST);
         }
        Response response=this.studentDataService.updateData(dataDTO);
        return new ResponseEntity<Response>(response,HttpStatus.OK);

    }
    //Delete the data into a table database based on user input
    @DeleteMapping("/data/{rollNumber}")
    public Response deleteData(@PathVariable("rollNumber")int rollNumber){
        return this.studentDataService.deleteData(rollNumber);
    }

   
    
    
}







