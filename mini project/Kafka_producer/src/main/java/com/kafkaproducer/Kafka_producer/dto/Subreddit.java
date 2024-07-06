package com.kafkaproducer.Kafka_producer.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subreddit implements Serializable {
    // Subreddit fields...
    private String id;
    private String name;
    private List<String> topics;
    private int subscribersCount;
    private String permalink;
}
