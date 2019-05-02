package com.testedoranieri;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory session = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Conexão mal sucedida! /n" + e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSession() {
		return session;		
	}
	
}
