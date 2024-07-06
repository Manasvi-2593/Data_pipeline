package com.kafkaconsumer.Kafka_consumer.dto;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post implements Serializable {
    // Post fields...
    private String id;
    private String title;
    private String body;
    private String url;
    private String createdAt;
    private Flair flair;
    private String languageCode;
    private String updatedAt;
    private int score;
    private int numComments;
    private String thumbnail;
    private Media media;
    private String permalink;
    private boolean self;
    private String type;

}

