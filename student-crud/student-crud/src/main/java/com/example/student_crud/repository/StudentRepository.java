package com.example.student_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.student_crud.model.Student;

public interface StudentRepository extends MongoRepository<Student,String> {

}
