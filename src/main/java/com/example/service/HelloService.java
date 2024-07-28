package com.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class HelloService {
    public String sayHello() {
        return "Hello";
    }
}
