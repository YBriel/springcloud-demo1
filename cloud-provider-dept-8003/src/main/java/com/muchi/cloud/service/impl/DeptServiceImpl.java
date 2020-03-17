package com.muchi.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.muchi.cloud.dao.DeptDAO;
import com.muchi.cloud.service.DeptService;
import com.muchi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/6   11:59
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDAO,Dept> implements DeptService {

    @Autowired
    private DeptDAO deptDAO;

    @Override
    public boolean add(Dept dept) {
        return deptDAO.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDAO.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDAO.findAll();
    }
}
