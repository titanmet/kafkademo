package com.ratnikov.producer.controller;

import com.ratnikov.producer.model.Message;
import com.ratnikov.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ProducerService producerService;

    @Autowired
    public HomeController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/generate")
    public String generate(@RequestParam String message, @RequestParam Integer age) {
        producerService.producer(new Message(message, age));
        return "OK";
    }
}
