package com.bridgeit.paytm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgeit.paytm.dao.LoginDao;
import com.bridgeit.paytm.model.PaytmSignupDTO;

@Component
public class LoginService {
	@Autowired
	private LoginDao logdao;

	public LoginService() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public boolean logService(String email, String password) {

		System.out.println("he data is present within the SERVICE class");
		System.out.println("the data are valid");
		PaytmSignupDTO pay = logdao.getdata(email, password);
		if (pay != null) {
			System.out.println("the datas are fetched suceesfully");
			return true;
		} else {
			System.out.println("the datas cannot be fetched ");
			return false;
		}
	}
}
