package com.sapient.kafkaproducer.controller;

import com.sapient.kafkaproducer.model.Message;
import com.sapient.kafkaproducer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/producer")
public class MessageController {

    @Autowired
    Producer producer;

    @GetMapping
    public String sayHello() {
        return "Hello from Producer!";
    }

    @PostMapping("/message")
    public String produce(@RequestBody Message message) {
        producer.produceMessage(message.getKey(), message.getValue());
        return "a";
    }

}
