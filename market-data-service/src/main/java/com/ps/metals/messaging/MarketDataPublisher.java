package com.ps.metals.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ps.metals.domain.MarketData;

@Service
public class MarketDataPublisher {
	
	private static Logger logger = LoggerFactory.getLogger(MarketDataPublisher.class);
	private final static String TOPIC = "marketdata";
	
	private static KafkaTemplate<String,MarketData> kafkaTemplate;
	
	
	public static void publishMessage() {
		logger.info("Entered into Message publish method");
		
		MarketData mkt = new MarketData();
		mkt.setCommodity("Aluminium");
		mkt.setPrice("123.3");
		mkt.setCurrency("US dollars");

		kafkaTemplate.send(TOPIC, mkt);

	}

}
