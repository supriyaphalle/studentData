package com.studentdata.studentdata.service;
import com.studentdata.studentdata.dto.DataDto;
import com.studentdata.studentdata.dto.UpdateDataDto;
import com.studentdata.studentdata.exception.DataException;
import com.studentdata.studentdata.exception.DataException.ExceptionType;
import com.studentdata.studentdata.model.StudentData;
import com.studentdata.studentdata.repository.StudentRepository;
import com.studentdata.studentdata.response.Response;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentDataService {
 
    @Autowired
    private StudentRepository studentRepository;
    
    public List<StudentData> getAllData(){
        List<StudentData> list =(List<StudentData>)this.studentRepository.findAll();
        return list;
    }

    public Response getDataByRollNumber(int number){
        Optional <StudentData>data = studentRepository.findByRollNumber(number);
        if(data.isPresent()){
            StudentData studentData=data.get();
            return new Response("Data Found", 200, studentData);
        }
        throw new DataException("ROLL NUMBER DOES NOT EXISTS", ExceptionType.DATA_DOES_NOT_EXIT);
    }

    public Response addData( DataDto data){
        StudentData studentData = new StudentData(data);
        Optional <StudentData> rollNumber = studentRepository.findByRollNumber(data.rollNumber);
        if(rollNumber.isPresent()){
            throw new DataException("DATA ALREADY EXISTS", ExceptionType.DATA_ALREADY_PRESENT);
        } 
        studentRepository.save(studentData);
        return new Response("Data added Successfully", 200, studentData);    
    }

    public Response updateData( UpdateDataDto dataDto){
       Optional <StudentData> data=studentRepository.findByRollNumber(dataDto.rollNumber);
       if(data.isPresent()){
            StudentData data1= data.get();
            data1.setMarks(dataDto.marks);
            studentRepository.save(data1);
            return new Response("Data Updated Successfully", 200, data1);
        }
        return new Response("Roll Number not found", 200, dataDto);    
    }

    public Response deleteData( int number){

        studentRepository.deleteById(number);
        return new Response("Data Deleted successfully", 200, number);
         
    }
}
