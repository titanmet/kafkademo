package com.ratnikov.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String message;
    private Integer age;
}
