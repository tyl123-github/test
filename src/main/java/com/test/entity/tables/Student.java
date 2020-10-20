/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables;


import com.test.entity.Indexes;
import com.test.entity.Keys;
import com.test.entity.Test;
import com.test.entity.tables.records.StudentRecord;

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
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = -946832319;

    /**
     * The reference instance of <code>test.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>test.student.id</code>.
     */
    public final TableField<StudentRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>test.student.name</code>.
     */
    public final TableField<StudentRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>test.student.age</code>.
     */
    public final TableField<StudentRecord, Integer> AGE = createField(DSL.name("age"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>test.student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    /**
     * Create an aliased <code>test.student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>test.student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Student(Table<O> child, ForeignKey<O, StudentRecord> key) {
        super(child, key, STUDENT);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STUDENT_PRIMARY);
    }

    @Override
    public Identity<StudentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT;
    }

    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.KEY_STUDENT_PRIMARY);
    }

    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}