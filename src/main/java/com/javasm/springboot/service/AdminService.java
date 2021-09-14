package com.javasm.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.springboot.entity.Admin;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-09-10
 */
public interface AdminService  {
     List<Admin> adminList();
}
