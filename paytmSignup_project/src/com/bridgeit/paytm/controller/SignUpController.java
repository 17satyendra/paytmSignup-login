package com.bridgeit.paytm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeit.paytm.model.PaytmSignupDTO;
import com.bridgeit.paytm.service.SignUpService;

@Component
@RequestMapping("/")
public class SignUpController 
{
	@Autowired
	private SignUpService signupservice;
	
	public SignUpController() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	@RequestMapping(value="/signup.do")
	public String signUp(PaytmSignupDTO paydto, HttpServletRequest request)
	{
		System.out.println("inside signup method");
		System.out.println(paydto+" can see details");
		request.setAttribute("paydto", paydto);
		boolean success = signupservice.signUpService(paydto);
		if(success)
			return "/success.jsp";
		return "/signup.jsp";
	}
}
