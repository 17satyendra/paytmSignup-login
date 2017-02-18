package com.bridgeit.paytm.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgeit.paytm.model.PaytmSignupDTO;
@Component
public class LoginDao {
	@Autowired
	private SessionFactory sessionfactory;

	public LoginDao() {
		System.out.println(this.getClass().getSimpleName() + " " + "created...");
	}

	public PaytmSignupDTO getdata(String email, String password) {
		System.out.println("saving inside dao...");
		System.out.println("we have to use hibernate");
		System.out.println("Session Factory...." + sessionfactory);

		Session session = sessionfactory.openSession();

		try {
			Criteria cr = session.createCriteria(PaytmSignupDTO.class);

			PaytmSignupDTO user = (PaytmSignupDTO) cr.add(Restrictions.conjunction().add(Restrictions.eq("email", email))
					.add(Restrictions.eq("password", password))).uniqueResult();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
}
