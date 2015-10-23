package com.manish.javadev.service;

import java.util.List;

import com.manish.javadev.to.StudentTo;

public interface StudentService {
	void addStudent(StudentTo sto);
	void deleteStudent(int sid);
	void findStudentById(int sid);
	List<StudentTo> findAllStudent();

}
