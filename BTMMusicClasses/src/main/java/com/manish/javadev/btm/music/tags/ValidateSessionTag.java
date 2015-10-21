package com.manish.javadev.btm.music.tags;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.manish.javadev.constant.BTMConstantAttribute;
import com.manish.javadev.controller.BTMMusicController;


public class ValidateSessionTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	public int doEndTag() throws JspException {
		try {
			HttpServletRequest req = (HttpServletRequest) pageContext
					.getRequest();
			HttpServletResponse res = (HttpServletResponse) pageContext
					.getResponse();
			if (req.getSession().getAttribute("USER_TO") == null) {
				req.setAttribute(BTMConstantAttribute.LOGIN_ERROR,"Session timeout .please login again");
				req.getRequestDispatcher("index.jsp").forward(req, res);
			}

		} catch (Exception e) {
			
		}
		return EVAL_PAGE;
	}
}
