package com.assignment.UniversityEventManagement.repo;

import com.assignment.UniversityEventManagement.model.Department;
import com.assignment.UniversityEventManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IStudent extends JpaRepository<Student, Long> {


    @Modifying
    @Query(value = "UPDATE STUDENTS SET STUDENT_DEPARTMENT = (:newDepartment) WHERE STUDENT_ID = (:id)", nativeQuery = true)
    void setStudentDepartment(Long id, Department newDepartment);
}
