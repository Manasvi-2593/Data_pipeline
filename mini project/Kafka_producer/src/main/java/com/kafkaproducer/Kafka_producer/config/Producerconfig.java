package com.kafkaproducer.Kafka_producer.config;

import com.kafkaproducer.Kafka_producer.dto.RedditEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Producerconfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerConfig.class);

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("current-topic1", 3, (short)1);
    }
    @Bean
    public Map<String , Object> producerConfig(){
        Map<String,Object> props= new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return props;
    }
    @Bean
    public ProducerFactory<String, RedditEvent> producerfactory(){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }
    @Bean
    public KafkaTemplate<String,RedditEvent> kafkaTemplate(){
        LOGGER.info("KafkaTemplate has been created successfully.");
        return new KafkaTemplate<>(producerfactory());

    }
}
