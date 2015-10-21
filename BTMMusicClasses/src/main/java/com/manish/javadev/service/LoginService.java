package com.manish.javadev.service;

import com.manish.javadev.model.LoginUser;

public interface LoginService {
	void loginUser(LoginUser loginUser);
	boolean isUserLogin();
}
