package com.jason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : yusik
 * @version : 1.0
 * @date : 2018-12-26
 * @description :
 */

@EnableEurekaClient
@SpringBootApplication
public class ChatApiApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ChatApiApplication.class, args);
    }
}
