package com.muchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/8   15:21
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigApp.class,args);
    }
}
