package com.manish.javadev.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.model.Customer;
import com.manish.javadev.to.CustomerTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void addCustomer(CustomerTO cto) {
		Customer cust = new Customer(cto.getFirstName(), cto.getLastName(),
				cto.getAge(), cto.getCity());
		System.out.println("entityManager   = " + entityManager);
		entityManager.persist(cust);
	}

	public void updateCustomer(CustomerTO cust) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub

	}

	public List<CustomerTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerTO getCustomerById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

}
