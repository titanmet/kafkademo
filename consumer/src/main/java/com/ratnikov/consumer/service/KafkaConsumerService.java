package com.ratnikov.consumer.service;

import com.ratnikov.consumer.model.Message;

public interface KafkaConsumerService {
    void receive(Message message);
}