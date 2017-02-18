package com.bridgeit.paytm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgeit.paytm.dao.signupDAO;
import com.bridgeit.paytm.model.PaytmSignupDTO;

@Component
public class SignUpService 
{
	@Autowired
	private signupDAO signupdao;
	
	public SignUpService() {
		System.out.println(this.getClass().getSimpleName()+" Created..");
	}
	public boolean signUpService(PaytmSignupDTO paydto) 
	{
		System.out.println("service for the DAO has to be done");
		
		if(paydto!=null)
		{
			System.out.println("data can be saved to database");
			signupdao.save(paydto);
			return true;
		}
		System.out.println("data is cannot be successfully saved");
		return false;
	}

}
