/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables.daos;


import com.test.entity.tables.TbUser;
import com.test.entity.tables.records.TbUserRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class TbUserDao extends DAOImpl<TbUserRecord, com.test.entity.tables.pojos.TbUser, Long> {

    /**
     * Create a new TbUserDao without any configuration
     */
    public TbUserDao() {
        super(TbUser.TB_USER, com.test.entity.tables.pojos.TbUser.class);
    }

    /**
     * Create a new TbUserDao with an attached configuration
     */
    public TbUserDao(Configuration configuration) {
        super(TbUser.TB_USER, com.test.entity.tables.pojos.TbUser.class, configuration);
    }

    @Override
    public Long getId(com.test.entity.tables.pojos.TbUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(TbUser.TB_USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchById(Long... values) {
        return fetch(TbUser.TB_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.test.entity.tables.pojos.TbUser fetchOneById(Long value) {
        return fetchOne(TbUser.TB_USER.ID, value);
    }

    /**
     * Fetch records that have <code>user_mobile BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchRangeOfUserMobile(String lowerInclusive, String upperInclusive) {
        return fetchRange(TbUser.TB_USER.USER_MOBILE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_mobile IN (values)</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchByUserMobile(String... values) {
        return fetch(TbUser.TB_USER.USER_MOBILE, values);
    }

    /**
     * Fetch records that have <code>user_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchRangeOfUserName(String lowerInclusive, String upperInclusive) {
        return fetchRange(TbUser.TB_USER.USER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<com.test.entity.tables.pojos.TbUser> fetchByUserName(String... values) {
        return fetch(TbUser.TB_USER.USER_NAME, values);
    }
}
