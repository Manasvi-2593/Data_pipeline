package com.kafkaproducer.Kafka_producer.controller;

import com.kafkaproducer.Kafka_producer.dto.RedditEvent;
import com.kafkaproducer.Kafka_producer.service.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class Eventcontroller {
@Autowired
    private MessagePublisher publisher;
   public Eventcontroller( MessagePublisher publisher){
       this.publisher=publisher;
   }
@PostMapping("/publish")
    public void sendevents(@RequestBody RedditEvent e){
    publisher.senddatatoconsumer(e);
}
}
