package com.kafkaconsumer.Kafka_consumer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RedditEvent implements Serializable {
//    @JsonProperty("id")
    private String id;

//    @JsonProperty("timestamp")
    private String timestamp;

//    @JsonProperty("eventType")
    private String eventType;

//    @JsonProperty("commentCreate")
    private CommentCreate commentCreate;


}







