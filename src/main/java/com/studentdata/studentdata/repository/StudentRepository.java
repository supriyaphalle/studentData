package com.studentdata.studentdata.repository;

import org.springframework.data.repository.CrudRepository;

import com.studentdata.studentdata.model.StudentData;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<StudentData,Integer>{

    Optional<StudentData> findByRollNumber(int rollNumber);

    //void deleteByRollNumber(int rollNumber);
}
