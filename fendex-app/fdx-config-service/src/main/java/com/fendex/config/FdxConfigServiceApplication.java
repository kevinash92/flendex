package com.fendex.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FdxConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdxConfigServiceApplication.class, args);
    }

}
