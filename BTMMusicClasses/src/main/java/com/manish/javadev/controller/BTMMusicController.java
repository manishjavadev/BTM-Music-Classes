package com.manish.javadev.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manish.javadev.service.StudentService;
import com.manish.javadev.to.UserTo;

@Controller
public class BTMMusicController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public ModelAndView loginUser() {

		ModelAndView model = new ModelAndView("loginHelper");
		return model;

	}

	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView model = new ModelAndView("index");
		return model;

	}

	@RequestMapping(value = "/about.htm", method = RequestMethod.GET)
	public ModelAndView aboutUs() {

		ModelAndView model = new ModelAndView("aboutHelper");
		return model;

	}

	@RequestMapping(value = "/blog.htm", method = RequestMethod.GET)
	public ModelAndView portUser() {

		ModelAndView model = new ModelAndView("blogHelper");
		return model;

	}

	@RequestMapping(value = "/contact.htm", method = RequestMethod.GET)
	public ModelAndView contactUs() {

		ModelAndView model = new ModelAndView("contactHelper");
		return model;

	}

	@RequestMapping(value = "/portfolio.htm", method = RequestMethod.GET)
	public ModelAndView portfolio() {

		ModelAndView model = new ModelAndView("portfolioHelper");
		return model;

	}

	@RequestMapping(value = "/pricing.htm", method = RequestMethod.GET)
	public ModelAndView pricing() {

		ModelAndView model = new ModelAndView("pricingHelper");
		return model;

	}

	@RequestMapping(value = "/services.htm", method = RequestMethod.GET)
	public ModelAndView services() {

		ModelAndView model = new ModelAndView("servicesHelper");
		return model;

	}

	@RequestMapping(value = "/shortcodes.htm", method = RequestMethod.GET)
	public ModelAndView shortcodes() {

		ModelAndView model = new ModelAndView("shortcodesHelper");
		return model;

	}

	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	public ModelAndView registerUser() {
		ModelAndView model = new ModelAndView("registerHelper");
		return model;

	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request) {
		ModelAndView model = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserTo uto = new UserTo();
		uto.setUserType("admin");
		uto.setUsername("Manish");

		if (null != uto) {
			if (username.equals(password)) {
				model = new ModelAndView("aboutHelper");
				request.getSession().setAttribute("USER_TO", uto);
			} else {
				model = new ModelAndView("loginHelper");
			}

		} else {
			model = new ModelAndView("loginHelper");
		}

		return model;
	}

	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public ModelAndView userRegister(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("index");
		/*
		 * StudentTo sto = new StudentTo(); // Adding one Student WeekdayStudent
		 * weekdayStudent = new WeekdayStudent("Manish", "BLR", "4.30PM",
		 * "Guitar", "MCA");
		 * 
		 * sto.setWeekdayStudent(weekdayStudent);
		 * studentService.addStudent(sto);
		 */

		String name = null;
		String email = null;
		String reEmail = null;
		String mobile = null;
		String[] courseType = null;
		String batchType = null;
		name = request.getParameter("userName");
		email = request.getParameter("userEmail");
		reEmail = request.getParameter("confirmEmail");
		mobile = request.getParameter("mobileNumber");
		courseType = request.getParameterValues("courseType");
		batchType = request.getParameter("batchType");

		System.out.println("name =  " + name + "email = " + email + "reEmail = "
				+ reEmail + "mobile = " + mobile + "course Type = "
				+ Arrays.toString(courseType) + "batch type = " + batchType);

		return model;
	}

	@RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
	public ModelAndView userLogout(HttpServletRequest request,
			HttpServletResponse response) {

		response.setHeader("Cache-Control",
				"no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		request.getSession().invalidate();
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping(value = "/displayStudents.htm", method = RequestMethod.GET)
	public ModelAndView findStudents(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Done");

		ModelAndView model = new ModelAndView("displayStudentsHelper");
		return model;
	}

}