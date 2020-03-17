package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   12:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.muchi.cloud","com.muchi.service"} )
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
