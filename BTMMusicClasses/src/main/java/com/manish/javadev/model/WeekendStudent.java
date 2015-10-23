package com.manish.javadev.model;

import javax.persistence.*;

@Entity
@Table(name = "WEStudent")
@PrimaryKeyJoinColumn(name = "SID")
public class WeekendStudent extends Student {
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TIMINGS")
	private String timings;
	@Column(name = "COURSE")
	private String course;

	public WeekendStudent() {
		super();
	}

	public WeekendStudent(String sname, String city, String timings,
			String course, String company, String email) {
		super(sname, city);
		this.company = company;
		this.email = email;
		this.timings = timings;
		this.course = course;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}