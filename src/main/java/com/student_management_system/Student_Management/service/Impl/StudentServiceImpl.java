package com.student_management_system.Student_Management.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student_management_system.Student_Management.entity.Student;
import com.student_management_system.Student_Management.repositry.StudentRepo;
import com.student_management_system.Student_Management.service.StudentService;

@Service

public class StudentServiceImpl implements StudentService {

//	@Autowired
	private StudentRepo repo;
	
	
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}



	@Override
	public Student getStudentById(long id) {
		
		return repo.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}



	@Override
	public void deleteStudent(long id) {
		repo.deleteById(id);
	}

}
