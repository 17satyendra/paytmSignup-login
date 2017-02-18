package com.bridgeit.paytm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.paytm.model.PaytmSignupDTO;

@Component
@Repository
@Transactional
public class signupDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public signupDAO() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public void save(PaytmSignupDTO paydto) 
	{
		System.out.println("Data saving...");

		Session sess = sessionFactory.getCurrentSession();

		try 
		{
			sess.save(paydto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
