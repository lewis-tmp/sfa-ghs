package com.sfa.ghs.bar.service;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test-bar.xml" })
public class BarRecordTempToServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	public static final Logger logger = Logger.getLogger(BarRecordTempToServiceImplTest.class);

	@Autowired
	private IBarRecordTempToService barSrv;

	@Test
	public void findAll() {
		assertNotNull(this.barSrv.findAll());
	}
}
