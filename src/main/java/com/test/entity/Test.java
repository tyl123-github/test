/*
 * This file is generated by jOOQ.
 */
package com.test.entity;


import com.test.entity.tables.JpaUser;
import com.test.entity.tables.Member;
import com.test.entity.tables.Student;
import com.test.entity.tables.SysMenu;
import com.test.entity.tables.SysRole;
import com.test.entity.tables.SysRoleMenu;
import com.test.entity.tables.SysUser;
import com.test.entity.tables.SysUserRole;
import com.test.entity.tables.TPermissions;
import com.test.entity.tables.TRole;
import com.test.entity.tables.TUser;
import com.test.entity.tables.TbUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends SchemaImpl {

    private static final long serialVersionUID = -528008887;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.jpa_user</code>.
     */
    public final JpaUser JPA_USER = com.test.entity.tables.JpaUser.JPA_USER;

    /**
     * The table <code>test.member</code>.
     */
    public final Member MEMBER = com.test.entity.tables.Member.MEMBER;

    /**
     * The table <code>test.student</code>.
     */
    public final Student STUDENT = com.test.entity.tables.Student.STUDENT;

    /**
     * 权限表
     */
    public final SysMenu SYS_MENU = com.test.entity.tables.SysMenu.SYS_MENU;

    /**
     * 角色表
     */
    public final SysRole SYS_ROLE = com.test.entity.tables.SysRole.SYS_ROLE;

    /**
     * 角色与权限关系表
     */
    public final SysRoleMenu SYS_ROLE_MENU = com.test.entity.tables.SysRoleMenu.SYS_ROLE_MENU;

    /**
     * 系统用户表
     */
    public final SysUser SYS_USER = com.test.entity.tables.SysUser.SYS_USER;

    /**
     * 用户与角色关系表
     */
    public final SysUserRole SYS_USER_ROLE = com.test.entity.tables.SysUserRole.SYS_USER_ROLE;

    /**
     * The table <code>test.tb_user</code>.
     */
    public final TbUser TB_USER = com.test.entity.tables.TbUser.TB_USER;

    /**
     * The table <code>test.t_permissions</code>.
     */
    public final TPermissions T_PERMISSIONS = com.test.entity.tables.TPermissions.T_PERMISSIONS;

    /**
     * The table <code>test.t_role</code>.
     */
    public final TRole T_ROLE = com.test.entity.tables.TRole.T_ROLE;

    /**
     * The table <code>test.t_user</code>.
     */
    public final TUser T_USER = com.test.entity.tables.TUser.T_USER;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            JpaUser.JPA_USER,
            Member.MEMBER,
            Student.STUDENT,
            SysMenu.SYS_MENU,
            SysRole.SYS_ROLE,
            SysRoleMenu.SYS_ROLE_MENU,
            SysUser.SYS_USER,
            SysUserRole.SYS_USER_ROLE,
            TbUser.TB_USER,
            TPermissions.T_PERMISSIONS,
            TRole.T_ROLE,
            TUser.T_USER);
    }
}
