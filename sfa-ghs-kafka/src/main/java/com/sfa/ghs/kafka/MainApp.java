package com.sfa.ghs.kafka;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static final Logger log = Logger.getLogger(MainApp.class);

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// 1. Spring容器初始化
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// ctx.start();
		//
		// ctx.stop();
		//
		// ctx.refresh();
		//
		// ctx.close();
	}
}
