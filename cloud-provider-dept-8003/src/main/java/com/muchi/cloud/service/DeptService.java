package com.muchi.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.muchi.entity.Dept;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   11:59
 */
public interface DeptService extends IService<Dept> {

     boolean add(Dept dept);

     Dept get(Long id);

     @Override
     List<Dept> list();

}
