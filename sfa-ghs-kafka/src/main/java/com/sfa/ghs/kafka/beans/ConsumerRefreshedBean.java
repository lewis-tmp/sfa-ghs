package com.sfa.ghs.kafka.beans;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.sf.kafka.api.consume.ConsumeConfig;
import com.sf.kafka.api.consume.ConsumeOptionalConfig;
import com.sf.kafka.api.consume.ConsumeOptionalConfig.AutoOffsetReset;
import com.sf.kafka.api.consume.IByteArrayMessageConsumeListener;
import com.sf.kafka.api.consume.KafkaConsumerRegister;
import com.sf.kafka.exception.KafkaException;

@Component
public class ConsumerRefreshedBean implements ApplicationListener<ContextRefreshedEvent> {
	public static final Logger log = Logger.getLogger(ConsumerRefreshedBean.class);

	@Autowired
	private ConsumeConfig cfg;

	@Autowired
	private IByteArrayMessageConsumeListener byteArrayListener;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		log.info("Register Kafka Byte Array Message Consumer Listener...");
		try {
			ConsumeOptionalConfig optionalConfig = new ConsumeOptionalConfig();
			optionalConfig.setAutoOffsetResetMinute(100);
			optionalConfig.setAutoOffsetReset(AutoOffsetReset.CUSTOM);

			KafkaConsumerRegister.registerByteArrayConsumer(cfg, byteArrayListener);
			log.info("Register Kafka Byte Array Message Consumer Listener success.");
		} catch (KafkaException e) {
			log.error("Register Kafka Byte Array Message Consumer Listener failed.", e);
		}
	}

}
