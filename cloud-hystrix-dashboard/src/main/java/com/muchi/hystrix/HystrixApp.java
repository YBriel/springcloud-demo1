package com.muchi.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/8   12:18
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class,args);
    }
}
