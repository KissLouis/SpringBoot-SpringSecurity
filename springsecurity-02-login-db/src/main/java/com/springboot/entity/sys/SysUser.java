package com.springboot.entity.sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Louis
 * @since 2019-06-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userId;

    private String userName;

    private String password;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 用户状态：1有效;0删除
     */
    private Integer status;

    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
