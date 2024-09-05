package com.student_management_system.Student_Management.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student_management_system.Student_Management.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
