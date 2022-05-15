package com.example.transactionrollbackmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TransactionRollbackMarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionRollbackMarkApplication.class, args);
    }

}
