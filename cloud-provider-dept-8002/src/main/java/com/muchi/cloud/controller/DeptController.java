package com.muchi.cloud.controller;

import com.muchi.cloud.service.DeptService;
import com.muchi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   12:04
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> list=client.getServices();
        System.out.println("**********"+list);
        List<ServiceInstance> cloud_dept = client.getInstances("CLOUD_DEPT");
        for (ServiceInstance serviceInstance : cloud_dept) {
            System.out.println(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost());
        }
        return this.client;
    }

}
