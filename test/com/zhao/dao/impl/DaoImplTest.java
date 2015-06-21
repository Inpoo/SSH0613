package com.zhao.dao.impl;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zhao.model.User;

public class DaoImplTest extends HibernateDaoSupport{

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		SessionFactory sf = this.getSessionFactory();
		Session session = this.getSession();
		//Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		fail("Not yet implemented");
	}

}
