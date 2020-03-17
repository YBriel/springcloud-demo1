package com.muchi.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.muchi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   11:47
 */
@Mapper
@Component
public interface DeptDAO extends BaseMapper<Dept> {

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
