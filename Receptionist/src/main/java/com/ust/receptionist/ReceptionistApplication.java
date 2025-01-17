package com.ust.receptionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReceptionistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceptionistApplication.class, args);
    }

}
