package com.bridgeit.paytm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeit.paytm.model.PaytmSignupDTO;
import com.bridgeit.paytm.service.LoginService;

@Component
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginService logservice;

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + "  " + "created...");
	}

	@RequestMapping(value = "/login.do")
	public String logController(PaytmSignupDTO paydto, HttpServletRequest request) {
		System.out.println("we are inside the signUpController signUp method ");
		System.out.println(paydto + "  " + "details.... ");
		String email=request.getParameter("email");
		String password= request.getParameter("password");
		boolean sucess = logservice.logService(email, password);
		if (sucess)
			return "/welcomelogin.jsp";
		return "/login.jsp";
	}
}
