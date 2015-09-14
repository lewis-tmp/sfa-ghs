package com.sfa.ghs.kafka.beans;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ConsumerStartBean implements ApplicationListener<ContextStartedEvent> {
	public static final Logger log = Logger.getLogger(ConsumerStartBean.class);

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		log.info("consumer start listener...");
	}

}
