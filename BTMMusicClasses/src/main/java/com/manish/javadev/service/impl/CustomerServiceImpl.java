package com.manish.javadev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.service.CustomerService;
import com.manish.javadev.to.CustomerTO;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	@Transactional
	public void addCustomer(CustomerTO cto) {
		System.out.println("CustomerDao = " + customerDao);
		customerDao.addCustomer(cto);

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
