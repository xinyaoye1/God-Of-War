package com.javasm.springboot.controller;


import com.javasm.springboot.entity.Admin;
import com.javasm.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-09-10
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
   @GetMapping("list")
    public List<Admin> findAdminList(){
       return adminService.adminList();
   }
}
