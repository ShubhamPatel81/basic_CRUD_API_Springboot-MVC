package com.student_management_system.Student_Management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "firstName", nullable = false)
		private String firstName;
		
		@Column(name = "lastName" )
		private String LastName;
		
		@Column(name = "email", nullable = false)
		private  String email;
		
		
		
		public Student() {
			
			// TODO Auto-generated constructor stub
		}
		public Student(long id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			LastName = lastName;
			this.email = email;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
