/*
 * This file is generated by jOOQ.
 */
package com.test.entity.tables.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

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
public class Member implements Serializable {

    private static final long serialVersionUID = -174997436;

    private Integer       id;
    private String        regname;
    private String        pwd;
    private String        mobilephone;
    private Byte          type;
    private Double        leaveamount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime regtime;

    public Member() {}

    public Member(Member value) {
        this.id = value.id;
        this.regname = value.regname;
        this.pwd = value.pwd;
        this.mobilephone = value.mobilephone;
        this.type = value.type;
        this.leaveamount = value.leaveamount;
        this.regtime = value.regtime;
    }

    public Member(
        Integer       id,
        String        regname,
        String        pwd,
        String        mobilephone,
        Byte          type,
        Double        leaveamount,
        LocalDateTime regtime
    ) {
        this.id = id;
        this.regname = regname;
        this.pwd = pwd;
        this.mobilephone = mobilephone;
        this.type = type;
        this.leaveamount = leaveamount;
        this.regtime = regtime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegname() {
        return this.regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobilephone() {
        return this.mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Double getLeaveamount() {
        return this.leaveamount;
    }

    public void setLeaveamount(Double leaveamount) {
        this.leaveamount = leaveamount;
    }

    public LocalDateTime getRegtime() {
        return this.regtime;
    }

    public void setRegtime(LocalDateTime regtime) {
        this.regtime = regtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Member (");

        sb.append(id);
        sb.append(", ").append(regname);
        sb.append(", ").append(pwd);
        sb.append(", ").append(mobilephone);
        sb.append(", ").append(type);
        sb.append(", ").append(leaveamount);
        sb.append(", ").append(regtime);

        sb.append(")");
        return sb.toString();
    }
}
