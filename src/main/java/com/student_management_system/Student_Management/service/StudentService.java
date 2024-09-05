package com.student_management_system.Student_Management.service;

import java.util.List;

import com.student_management_system.Student_Management.entity.Student;

public interface StudentService {
      List<Student> getAllStudent();
      
      Student saveStudent(Student student);
      
      Student getStudentById(long id);
      Student updateStudent(Student student);
      
      
      void deleteStudent(long id);
}
