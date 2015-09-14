package com.sfa.ghs.kafka.beans;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ConsumerClosedBean implements ApplicationListener<ContextClosedEvent> {
	public static final Logger log = Logger.getLogger(ConsumerClosedBean.class);

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		log.info("consumer closed listener...");
	}

}
