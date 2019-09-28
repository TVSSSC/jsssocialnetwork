package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.User;

public class SessionProvider
{
private final static SessionFactory FACTORY;
	
	static
	{
		FACTORY = new Configuration().configure().addAnnotatedClass
		(User.class).buildSessionFactory();
	}
	
	public static Session getSession()
	{
		return FACTORY.openSession();
	}
}
