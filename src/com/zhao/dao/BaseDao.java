package com.zhao.dao;

import java.util.List;

public interface BaseDao<T> {
	public void save(T o);
	public void delete(T o);
	public T get(String hql, List<Object> param);
	public List<T> find(String hql, List<Object> param);
	public void update(T o);
}
