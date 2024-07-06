package com.kafkaproducer.Kafka_producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkaproducer.Kafka_producer.dto.RedditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
@Service
public class MessagePublisher {
    @Autowired
    private KafkaTemplate<String, RedditEvent> template;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void senddatatoconsumer(RedditEvent event) {
        try {
            String jsonEvent = objectMapper.writeValueAsString(event);
            CompletableFuture<SendResult<String, RedditEvent>> future = template.send("current-topic1",event);
            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    System.out.println("Sent message=[" + jsonEvent + "] with offset=[" + result.getRecordMetadata().offset() + "]");
                } else {
                    System.out.println("Unable to send message=[" + jsonEvent + "] due to : " + ex.getMessage());
                }
            });
        } catch (JsonProcessingException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
