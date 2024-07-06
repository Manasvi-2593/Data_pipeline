package com.kafkaproducer.Kafka_producer.dto;

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
