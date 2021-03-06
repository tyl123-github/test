/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


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
public class TUser implements Serializable {

    private static final long serialVersionUID = 2105369660;

    private Integer id;
    private String  userName;
    private String  passWord;

    public TUser() {}

    public TUser(TUser value) {
        this.id = value.id;
        this.userName = value.userName;
        this.passWord = value.passWord;
    }

    public TUser(
        Integer id,
        String  userName,
        String  passWord
    ) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TUser (");

        sb.append(id);
        sb.append(", ").append(userName);
        sb.append(", ").append(passWord);

        sb.append(")");
        return sb.toString();
    }
}
