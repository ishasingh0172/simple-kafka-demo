package com.sapient.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicsConfig {
    @Bean
    NewTopic createDemoTopic() {
        return TopicBuilder.name("demoTopic").partitions(3).replicas(1).build();
    }
}
