package com.song.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplucation {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplucation.class,args);
    }
}
