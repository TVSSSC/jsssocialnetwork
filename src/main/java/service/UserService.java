package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import beans.User;
import config.SessionProvider;

public class UserService 
{
	public static void saveUserInDB(User user)
	{
		Session session = SessionProvider.getSession();
		session.persist(user);
		session.beginTransaction().commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public static List<User> getUser(String hql,
			int start_record, int no_of_records)
	{
		Session session = SessionProvider.getSession();
		Query<User> query = session.createQuery(hql);
		query.setFirstResult(start_record); // first record = 0
		query.setMaxResults(no_of_records); // itne 
		return query.list();
	}
}










