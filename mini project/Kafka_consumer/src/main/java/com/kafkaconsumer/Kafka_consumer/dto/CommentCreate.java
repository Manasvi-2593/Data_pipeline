package com.kafkaconsumer.Kafka_consumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentCreate implements Serializable {
    @JsonProperty("comment")
    private Comment comment;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("post")
    private Post post;

    @JsonProperty("subreddit")
    private Subreddit subreddit;
    public Comment getComment() {
        return comment;
    }
}
