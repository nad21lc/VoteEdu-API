package com.acme.voteeduapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VoteEduApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoteEduApiApplication.class, args);
    }

}
