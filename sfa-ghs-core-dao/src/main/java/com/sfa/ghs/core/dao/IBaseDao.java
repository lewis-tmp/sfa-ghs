package com.sfa.ghs.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public interface IBaseDao<T> {

	public Session getSession();

	public Criteria createCriteria();

	public T get(Long id);

	public void insert(T obj);

	public void merge(T obj);

	public void update(T obj);

	public void delete(T obj);

	public void delete(Long id);

	public List<T> findAll();
}
