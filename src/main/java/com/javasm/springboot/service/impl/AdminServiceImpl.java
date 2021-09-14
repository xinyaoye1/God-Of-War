package com.javasm.springboot.service.impl;


import com.javasm.springboot.entity.Admin;
import com.javasm.springboot.mapper.AdminMapper;
import com.javasm.springboot.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-09-10
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> adminList() {
        return adminMapper.adminList()  ;
    }
}
