package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Department;
import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.repo.IStudent;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudent studentRepo;


    public String addAllStudents(List<Student> newStudent) {
        studentRepo.saveAll(newStudent);
        return newStudent.size() +" students added successfully";
    }

    public List<Student> getAllStudents() {
        return  studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Transactional
    public String updateStudentDepartmentById(Long id, Department newDepartment) {

        studentRepo.setStudentDepartment(id, Department.valueOf(newDepartment.name()));
        return "Student with id: "+id+ " updated successfully.";

    }

    public String removeStudentById(Long id) {
        studentRepo.deleteById(id);
        return "Student with id: "+id+ " deleted successfully";
    }

    public String removeAllStudent() {
        studentRepo.deleteAll();
        return "All the student's record deleted successfully";
    }
}
