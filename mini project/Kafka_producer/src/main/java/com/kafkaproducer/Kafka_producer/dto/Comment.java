package com.kafkaproducer.Kafka_producer.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment implements Serializable {
    // Comment fields...
    private String id;
    private String body;
    private String parentId;
    private String createdAt;
    private String languageCode;
    private int score;
    private String permalink;
    private List<String> elementTypes;

}
