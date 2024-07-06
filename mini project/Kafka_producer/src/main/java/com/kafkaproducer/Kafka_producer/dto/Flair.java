package com.kafkaproducer.Kafka_producer.dto;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Flair implements Serializable {
    // Flair fields...
    private String text;
    // Constructors, getters, and setters for Flair...

}