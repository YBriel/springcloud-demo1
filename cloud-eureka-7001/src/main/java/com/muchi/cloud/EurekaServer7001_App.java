package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   13:12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
