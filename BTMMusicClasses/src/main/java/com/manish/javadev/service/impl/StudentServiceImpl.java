package com.manish.javadev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.dao.StudentDao;
import com.manish.javadev.service.StudentService;
import com.manish.javadev.to.StudentTo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void addStudent(StudentTo sto) {
		studentDao.addStudent(sto);		
	}

	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
	}

	public void findStudentById(int sid) {
		// TODO Auto-generated method stub
		
	}

	public List<StudentTo> findAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
