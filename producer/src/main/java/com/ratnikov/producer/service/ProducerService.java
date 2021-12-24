package com.ratnikov.producer.service;

import com.ratnikov.producer.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void producer(Message message) {
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send("messages", message);
    }
}