



package com.keyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.keyin")
public class AirTravelApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirTravelApplication.class, args);
    }
}