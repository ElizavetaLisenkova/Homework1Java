package com.lisenkova.lisenkova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LisenkovaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LisenkovaSpringApplication.class, args);
    }

}
