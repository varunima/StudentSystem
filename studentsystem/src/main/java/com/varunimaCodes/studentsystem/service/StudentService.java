package com.varunimaCodes.studentsystem.service;

import java.util.List;

import com.varunimaCodes.studentsystem.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudent(); 
}
