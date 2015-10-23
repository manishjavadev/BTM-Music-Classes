package com.manish.javadev.dao;

import java.util.List;

import com.manish.javadev.to.StudentTo;

public interface StudentDao {
	void addStudent(StudentTo sto);
	void deleteStudent(int sid);
	void findStudentById(int sid);
	List<StudentTo> findAllStudent();
}
