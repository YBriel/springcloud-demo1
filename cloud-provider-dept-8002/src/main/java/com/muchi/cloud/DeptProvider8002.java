package com.muchi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   12:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class DeptProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002.class,args);
    }
}
