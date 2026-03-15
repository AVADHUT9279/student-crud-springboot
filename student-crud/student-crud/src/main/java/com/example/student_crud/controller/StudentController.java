package com.example.student_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.student_crud.model.Student;
import com.example.student_crud.repository.StudentRepository;

@CrossOrigin(origins = "http://127.0.0.1:5500")   // ⭐ ADD THIS
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return repository.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id){
        repository.deleteById(id);
        return "Student Deleted";
    }
}