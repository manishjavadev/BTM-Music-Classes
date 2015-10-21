package com.manish.javadev.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.dao.StudentDAO;
import com.manish.javadev.model.Customer;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext
	private EntityManager entityManager;
	@Transactional(readOnly = false)
	public void addStudent(Customer cust) {
		System.out.println("Dao Layer");
		System.out.println("Entity Manager  = " + entityManager);
		entityManager.persist(cust);
		System.out.println("Done");

	}

}
