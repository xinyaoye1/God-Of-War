package com.javasm.springboot.mapper;

import com.javasm.springboot.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-09-10
 */
@Mapper
public interface AdminMapper{
    List<Admin> adminList();
}
