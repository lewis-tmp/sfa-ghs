package com.sfa.ghs.kafka.beans;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

import com.sf.kafka.api.consume.ConsumeConfig;
import com.sf.kafka.api.consume.KafkaConsumerRegister;

@Component
public class ConsumerStopBean implements ApplicationListener<ContextStoppedEvent> {
	public static final Logger log = Logger.getLogger(ConsumerStopBean.class);

	@Autowired
	private ConsumeConfig cfg;

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		log.info("UnRegister Kafka Byte Array Message Consumer Listener...");

		boolean result = KafkaConsumerRegister.unregister(cfg.getTopic());
		if (result) {
			log.info("UnRegister Kafka Byte Array Message Consumer Listener success.");
		} else {
			log.error("UnRegister Kafka Byte Array Message Consumer Listener failed.");
		}
	}

}
