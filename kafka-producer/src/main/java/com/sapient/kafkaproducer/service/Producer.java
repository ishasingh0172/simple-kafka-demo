package com.sapient.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Value("${producerTopic}")
    private String TOPIC;

    @Autowired
    KafkaTemplate<String, String> template;

    public void produceMessage(String key, String value) {
        template.send(TOPIC,key,value);
    }
}
