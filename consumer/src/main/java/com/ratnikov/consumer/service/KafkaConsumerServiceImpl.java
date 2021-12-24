package com.ratnikov.consumer.service;

import com.ratnikov.consumer.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void receive(Message message) {
        System.out.println("Consuming the message: " + message);
    }
}
