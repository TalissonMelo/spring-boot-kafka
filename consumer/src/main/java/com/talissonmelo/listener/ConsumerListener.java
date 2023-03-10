package com.talissonmelo.listener;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

	@KafkaListener(topics = "topic-1", groupId = "group-1")
    public void listen(List<String> msg) {
		msg.forEach(System.err::println);
    }
}
