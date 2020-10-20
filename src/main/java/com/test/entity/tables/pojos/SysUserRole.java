/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * 用户与角色关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = -1492430710;

    private Long id;
    private Long userId;
    private Long roleId;

    public SysUserRole() {}

    public SysUserRole(SysUserRole value) {
        this.id = value.id;
        this.userId = value.userId;
        this.roleId = value.roleId;
    }

    public SysUserRole(
        Long id,
        Long userId,
        Long roleId
    ) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysUserRole (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
