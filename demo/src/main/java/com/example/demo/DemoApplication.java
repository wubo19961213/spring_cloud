package com.example.demo;

import com.example.demo.item.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private Hero hero;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

}

