package com.kafkaconsumer.Kafka_consumer.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Media {
    private String type;
    private Oembed oembed;

}
