package com.kafkaproducer.Kafka_producer.dto;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author implements Serializable {
    // Author fields...
    private String id;
    private String name;
    private String karma;
    private String url;
    private String snoovatarImage;
    private Flair flair;
    private String iconImage;
    // Constructors, getters, and setters for Author...

}
