package com.springboot.service.sys;

import com.springboot.entity.sys.SysUser;

/**
 * @author Louis
 * @title: SysUserService
 * @projectName springboot-chapter
 * @description: TODO
 * @date 2019/6/29 15:59
 */
public interface SysUserService {

    SysUser getUserByUsername(String userName);

    void insert(SysUser user);
}
