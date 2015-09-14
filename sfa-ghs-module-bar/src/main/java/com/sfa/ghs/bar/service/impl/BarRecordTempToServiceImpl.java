package com.sfa.ghs.bar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfa.ghs.bar.dao.IBarRecordTempToDao;
import com.sfa.ghs.bar.domain.BarRecordTempTo;
import com.sfa.ghs.bar.exception.BarServiceException;
import com.sfa.ghs.bar.service.IBarRecordTempToService;

@Service
public class BarRecordTempToServiceImpl implements IBarRecordTempToService {
	@Autowired
	private IBarRecordTempToDao barDao;

	@Override
	public void insert(BarRecordTempTo obj) throws BarServiceException {
		this.barDao.insert(obj);
	}

	@Override
	public void inserts(List<BarRecordTempTo> list) throws BarServiceException {
		for (BarRecordTempTo obj : list) {
			this.barDao.insert(obj);
		}
	}

	@Override
	public BarRecordTempTo get(Long id) throws BarServiceException {
		return this.barDao.get(id);
	}

	@Override
	public List<BarRecordTempTo> findAll() throws BarServiceException {
		return this.barDao.findAll();
	}
}
