/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables;


import com.test.entity.Indexes;
import com.test.entity.Keys;
import com.test.entity.Test;
import com.test.entity.tables.records.SysUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 系统用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUser extends TableImpl<SysUserRecord> {

    private static final long serialVersionUID = 2097398431;

    /**
     * The reference instance of <code>test.sys_user</code>
     */
    public static final SysUser SYS_USER = new SysUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysUserRecord> getRecordType() {
        return SysUserRecord.class;
    }

    /**
     * The column <code>test.sys_user.user_id</code>. 用户ID
     */
    public final TableField<SysUserRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "用户ID");

    /**
     * The column <code>test.sys_user.username</code>. 用户名
     */
    public final TableField<SysUserRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "用户名");

    /**
     * The column <code>test.sys_user.password</code>. 密码
     */
    public final TableField<SysUserRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "密码");

    /**
     * The column <code>test.sys_user.salt</code>. 盐值
     */
    public final TableField<SysUserRecord, String> SALT = createField(DSL.name("salt"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "盐值");

    /**
     * The column <code>test.sys_user.state</code>. 状态:NORMAL正常  PROHIBIT禁用
     */
    public final TableField<SysUserRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "状态:NORMAL正常  PROHIBIT禁用");

    /**
     * Create a <code>test.sys_user</code> table reference
     */
    public SysUser() {
        this(DSL.name("sys_user"), null);
    }

    /**
     * Create an aliased <code>test.sys_user</code> table reference
     */
    public SysUser(String alias) {
        this(DSL.name(alias), SYS_USER);
    }

    /**
     * Create an aliased <code>test.sys_user</code> table reference
     */
    public SysUser(Name alias) {
        this(alias, SYS_USER);
    }

    private SysUser(Name alias, Table<SysUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysUser(Name alias, Table<SysUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("系统用户表"));
    }

    public <O extends Record> SysUser(Table<O> child, ForeignKey<O, SysUserRecord> key) {
        super(child, key, SYS_USER);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_USER_PRIMARY);
    }

    @Override
    public Identity<SysUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_USER;
    }

    @Override
    public UniqueKey<SysUserRecord> getPrimaryKey() {
        return Keys.KEY_SYS_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysUserRecord>> getKeys() {
        return Arrays.<UniqueKey<SysUserRecord>>asList(Keys.KEY_SYS_USER_PRIMARY);
    }

    @Override
    public SysUser as(String alias) {
        return new SysUser(DSL.name(alias), this);
    }

    @Override
    public SysUser as(Name alias) {
        return new SysUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUser rename(String name) {
        return new SysUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysUser rename(Name name) {
        return new SysUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
