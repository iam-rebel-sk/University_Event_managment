package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Department;
import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.service.EventService;
import com.assignment.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentController {
    //all student related
    @Autowired
    StudentService myStudent;

    @PostMapping("students")
    public String addAllStudents(@RequestBody List<Student> newStudent){
        return myStudent.addAllStudents(newStudent);
    }
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return myStudent.getAllStudents();
    }

    @GetMapping("student/id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return myStudent.getStudentById(id);
    }

    @PutMapping("student/id/{id}")
    public String updateStudentDepartmentById(@PathVariable Long id, @RequestParam Department newDepartment){
        return myStudent.updateStudentDepartmentById(id, newDepartment);
    }

    @DeleteMapping("student/id/{id}")
    public String removeStudentById(@PathVariable Long id){
        return myStudent.removeStudentById(id);
    }

    @DeleteMapping("students")
    public String removeAllStudent(){
        return myStudent.removeAllStudent();
    }



}
