package com.manish.javadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name="SNAME")
	private String sname;
	@Column(name="CITY")
	private String city;

	public Student() {
		super();
	}

	public Student(String sname, String city) {
		this.sname = sname;
		this.city = city;
	}
	
}