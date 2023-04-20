package com.example.IRageCapital_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories
public class IRageCapitalAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(IRageCapitalAssignmentApplication.class, args);
    }

}
