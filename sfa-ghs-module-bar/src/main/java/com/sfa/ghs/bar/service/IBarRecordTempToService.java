package com.sfa.ghs.bar.service;

import java.util.List;

import com.sfa.ghs.bar.domain.BarRecordTempTo;
import com.sfa.ghs.bar.exception.BarServiceException;

public interface IBarRecordTempToService {
	/**
	 * 新增对象
	 * 
	 * @param obj
	 * @throws BarServiceException
	 */
	public void insert(BarRecordTempTo obj) throws BarServiceException;

	/**
	 * 新增一批对象
	 * 
	 * @param list
	 * @throws BarServiceException
	 */
	public void inserts(List<BarRecordTempTo> list) throws BarServiceException;

	/**
	 * 根据主键查找
	 * 
	 * @param id
	 * @return
	 * @throws BarServiceException
	 */
	public BarRecordTempTo get(Long id) throws BarServiceException;

	/**
	 * 查询全部
	 * 
	 * @return
	 * @throws BarServiceException
	 */
	public List<BarRecordTempTo> findAll() throws BarServiceException;
}
