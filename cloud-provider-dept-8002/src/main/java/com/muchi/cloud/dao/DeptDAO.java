package com.muchi.cloud.dao;

import com.muchi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   11:47
 */
@Mapper
public interface DeptDAO {

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
