package com.muchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/8   14:12
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }
}
