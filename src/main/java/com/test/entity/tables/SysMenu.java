/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables;


import com.test.entity.Indexes;
import com.test.entity.Keys;
import com.test.entity.Test;
import com.test.entity.tables.records.SysMenuRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 权限表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMenu extends TableImpl<SysMenuRecord> {

    private static final long serialVersionUID = -277036714;

    /**
     * The reference instance of <code>test.sys_menu</code>
     */
    public static final SysMenu SYS_MENU = new SysMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysMenuRecord> getRecordType() {
        return SysMenuRecord.class;
    }

    /**
     * The column <code>test.sys_menu.menu_id</code>. 权限ID
     */
    public final TableField<SysMenuRecord, Long> MENU_ID = createField(DSL.name("menu_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "权限ID");

    /**
     * The column <code>test.sys_menu.name</code>. 权限名称
     */
    public final TableField<SysMenuRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "权限名称");

    /**
     * The column <code>test.sys_menu.perms</code>. 权限标识
     */
    public final TableField<SysMenuRecord, String> PERMS = createField(DSL.name("perms"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "权限标识");

    /**
     * Create a <code>test.sys_menu</code> table reference
     */
    public SysMenu() {
        this(DSL.name("sys_menu"), null);
    }

    /**
     * Create an aliased <code>test.sys_menu</code> table reference
     */
    public SysMenu(String alias) {
        this(DSL.name(alias), SYS_MENU);
    }

    /**
     * Create an aliased <code>test.sys_menu</code> table reference
     */
    public SysMenu(Name alias) {
        this(alias, SYS_MENU);
    }

    private SysMenu(Name alias, Table<SysMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysMenu(Name alias, Table<SysMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("权限表"));
    }

    public <O extends Record> SysMenu(Table<O> child, ForeignKey<O, SysMenuRecord> key) {
        super(child, key, SYS_MENU);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_MENU_PRIMARY);
    }

    @Override
    public Identity<SysMenuRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_MENU;
    }

    @Override
    public UniqueKey<SysMenuRecord> getPrimaryKey() {
        return Keys.KEY_SYS_MENU_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<SysMenuRecord>>asList(Keys.KEY_SYS_MENU_PRIMARY);
    }

    @Override
    public SysMenu as(String alias) {
        return new SysMenu(DSL.name(alias), this);
    }

    @Override
    public SysMenu as(Name alias) {
        return new SysMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysMenu rename(String name) {
        return new SysMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysMenu rename(Name name) {
        return new SysMenu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}