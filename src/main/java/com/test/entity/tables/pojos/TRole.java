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
public class TRole implements Serializable {

    private static final long serialVersionUID = 967650432;

    private String id;
    private String roleName;

    public TRole() {}

    public TRole(TRole value) {
        this.id = value.id;
        this.roleName = value.roleName;
    }

    public TRole(
        String id,
        String roleName
    ) {
        this.id = id;
        this.roleName = roleName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRole (");

        sb.append(id);
        sb.append(", ").append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
