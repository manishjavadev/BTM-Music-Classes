package com.manish.javadev.to;

import com.manish.javadev.model.Student;
import com.manish.javadev.model.WeekdayStudent;
import com.manish.javadev.model.WeekendStudent;

public class StudentTo {
	private Student student;
	
	private WeekendStudent weekendStudent;
	private WeekdayStudent weekdayStudent;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public WeekendStudent getWeekendStudent() {
		return weekendStudent;
	}
	public void setWeekendStudent(WeekendStudent weekendStudent) {
		this.weekendStudent = weekendStudent;
	}
	public WeekdayStudent getWeekdayStudent() {
		return weekdayStudent;
	}
	public void setWeekdayStudent(WeekdayStudent weekdayStudent) {
		this.weekdayStudent = weekdayStudent;
	}
	

}
