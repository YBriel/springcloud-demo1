package com.muchi.cloud.controller;

import com.muchi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   12:23
 */
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL = "http://localhost:8001";
    private static final String REST_URL = "http://CLOUD-DEPT";

    @Autowired
    private RestTemplate template;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return template.postForObject(REST_URL + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return template.getForObject(REST_URL + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return template.getForObject(REST_URL + "/dept/list", List.class);
    }

}
