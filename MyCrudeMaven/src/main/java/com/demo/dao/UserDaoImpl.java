package com.demo.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.models.MyUser;

@SuppressWarnings("deprecation")
public class UserDaoImpl implements UserDao {
	static SessionFactory sf;
	public UserDaoImpl() {
		sf = HibernateUtil.getMySession();
	}
	@Override
	public void save(MyUser u) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();		
	}
	@Override
	public List<MyUser> findAll() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query = session.createQuery("from MyUser");
		List<MyUser> ulist = query.list();
		tr.commit();
		session.close();
		return ulist;
	}
	@Override
	public MyUser findbyid(int uid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		MyUser u=session.get(MyUser.class,uid);
		tr.commit();
		session.close();
		
		return u;
	}
	@Override
	public boolean deleteById(int uid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		MyUser u=session.get(MyUser.class,uid);
		if(u!=null) {
			session.delete(u);
			tr.commit();
			session.close();
			return true;
		
			
		}
		session.close();
		return false;
	}
	@Override
	public boolean updateByid(int uid, String unm, String street) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		MyUser u=session.get(MyUser.class, uid);
		if(u!=null) {
			u.setUname(unm);
			u.getAddr().setStreet(street);
			session.update(u);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}
	@Override
	public List<MyUser> getSorted() {
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	Query query=session.createQuery("from Myuser u order by u.uid desc");
	List<MyUser> ulst=query.getResultList();
	tr.commit();
	session.close();
	return ulst;
	
	}
	@Override
	public void closeMySessionFactory() {
		HibernateUtil.closeMySession();
		
	}
	
	
}
