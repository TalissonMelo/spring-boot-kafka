package com.talissonmelo.listener;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

	@KafkaListener(topics = "topic", groupId = "group-1")
    public void listen(List<String> messages) {
        messages.forEach(System.out::println);
    }
}
