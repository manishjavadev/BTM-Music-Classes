package com.manish.javadev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.manish.javadev.dao.StudentDAO;
import com.manish.javadev.model.Customer;
import com.manish.javadev.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Transactional(readOnly = false)
	public void addStudent(Customer cust) {
		studentDao.addStudent(cust);		
	}
}
