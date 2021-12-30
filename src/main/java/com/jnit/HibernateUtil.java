package com.jnit;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	@SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactory() {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		return sessionFactory;
	}
}
