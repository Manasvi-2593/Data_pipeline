package com.kafkaconsumer.Kafka_consumer.consumer;

import com.kafkaconsumer.Kafka_consumer.dto.RedditEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkamessagelistener {

    Logger log = LoggerFactory.getLogger(kafkamessagelistener.class);

    @KafkaListener(topics = "current-topic1",groupId = "abc")
    public void consume(RedditEvent customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }
}