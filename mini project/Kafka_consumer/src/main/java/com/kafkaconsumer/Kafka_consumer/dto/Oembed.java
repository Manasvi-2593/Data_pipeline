package com.kafkaconsumer.Kafka_consumer.dto;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Oembed implements Serializable {
    // Oembed fields...
    private String type;
    private String version;
    private String authorName;
    private String authorUrl;
    private String providerName;
    private String providerUrl;
    private String html;
    private int width;
    private Integer height;
    // Constructors, getters, and setters for Oembed...

}
