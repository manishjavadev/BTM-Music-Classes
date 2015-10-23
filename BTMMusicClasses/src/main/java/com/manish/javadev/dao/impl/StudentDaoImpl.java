package com.manish.javadev.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.manish.javadev.dao.StudentDao;
import com.manish.javadev.model.WeekdayStudent;
import com.manish.javadev.model.WeekendStudent;
import com.manish.javadev.to.StudentTo;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void addStudent(StudentTo sto) {
		System.out.println("Dao Layer");
		WeekdayStudent weekdayStudent = null;
		WeekendStudent weekendStudent = null;

		weekendStudent = sto.getWeekendStudent();
		weekdayStudent = sto.getWeekdayStudent();

		System.out.println("Entity Manager  = " + entityManager);
		if (null != weekendStudent) {
			entityManager.persist(weekendStudent);
		}
		else if(null!= weekdayStudent){
			entityManager.persist(weekdayStudent);
		}
		System.out.println("Done");

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
