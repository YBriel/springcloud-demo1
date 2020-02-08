package com.muchi.cloud.service;

import com.muchi.entity.Dept;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   11:59
 */
public interface DeptService {

     boolean add(Dept dept);

     Dept get(Long id);

     List<Dept> list();

}
