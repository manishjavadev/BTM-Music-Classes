package com.manish.javadev.model;

import javax.persistence.*;

@Entity
@Table(name = "WDStudent")
@PrimaryKeyJoinColumn(name = "SID")
public class WeekdayStudent extends Student {
	@Column(name = "QUALIFI")
	private String qualification;
	@Column(name = "TIMINGS")
	private String timings;
	@Column(name = "COURSE")
	private String course;
	
	public WeekdayStudent() {
		super();
	}

	public WeekdayStudent(String sname, String city, String timings,
			String course, String qualification) {
		super(sname, city);
		this.qualification = qualification;
		this.timings = timings;
		this.course = course;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
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