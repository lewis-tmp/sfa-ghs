package com.sfa.ghs.core.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sfa.ghs.core.dao.IBaseDao;

@Repository
public abstract class BaseDao<T> implements IBaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public BaseDao() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		entityClass = (Class<T>) type.getActualTypeArguments()[0];
	}

	@Override
	public Criteria createCriteria() {
		return this.getSession().createCriteria(entityClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Long id) {
		return (T) this.getSession().get(entityClass, id);
	}

	@Override
	public void insert(T obj) {
		this.getSession().save(obj);
		this.getSession().flush();
	}

	@Override
	public void merge(T obj) {
		this.getSession().merge(obj);
		this.getSession().flush();
	}

	@Override
	public void update(T obj) {
		this.getSession().update(obj);
		this.getSession().flush();
	}

	@Override
	public void delete(T obj) {
		this.getSession().delete(obj);
		this.getSession().flush();
	}

	@Override
	public void delete(Long id) {
		this.delete(this.get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return this.createCriteria().list();
	}
}
