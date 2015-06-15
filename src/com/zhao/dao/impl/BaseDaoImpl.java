package com.zhao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhao.dao.BaseDao;
@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T>{
	private SessionFactory sessionFactory;
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(String hql, List<Object> param) {
		System.out.println("get!");
		List<T> l = this.find(hql, param);
		if (l != null && l.size() > 0) {
			return l.get(0);
		} else {
			return null;
		}
	}
	@Override
	public List<T> find(String hql, List<Object> param) {
		System.out.println("find!");
		Query q = this.getCurrentSession().createQuery(hql);
		if (param != null && param.size() > 0) {
			for (int i = 0; i < param.size(); i++) {
				q.setParameter(i, param.get(i));
			}
		}
		return q.list();
	}
	@Override
	public void update(T o) {
		// TODO Auto-generated method stub
		
	}
	

}
