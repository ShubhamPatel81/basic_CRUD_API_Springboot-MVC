package com.student_management_system.Student_Management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.student_management_system.Student_Management.entity.Student;
import com.student_management_system.Student_Management.service.StudentService;

@Controller
public class StudentController {

	
	private StudentService service;
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	// Handler method to handle requst
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students",service.getAllStudent());
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student")Student student ) {
		service.saveStudent(student);
		return "redirect:/students";
	}
	
	
	@GetMapping("/students/edit/{id}")
	public String editStudentsForm(@PathVariable Long id, Model model) {
	    model.addAttribute("student", service.getStudentById(id));
	    return "edit_student";
	}

	  
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable long id,@ModelAttribute("student") Student student , Model model) {
		
		// getting existing data and update it
		Student existingStudent = service.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setId(id);
		
		// save updated 
		service.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	//handler mehod to handle delete student request 
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable long id) {
		service.deleteStudent(id);
		return "redirect:/students";
	}
}
