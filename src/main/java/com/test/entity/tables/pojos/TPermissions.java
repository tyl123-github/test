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
public class TPermissions implements Serializable {

    private static final long serialVersionUID = -964651586;

    private String id;
    private String permissionsName;

    public TPermissions() {}

    public TPermissions(TPermissions value) {
        this.id = value.id;
        this.permissionsName = value.permissionsName;
    }

    public TPermissions(
        String id,
        String permissionsName
    ) {
        this.id = id;
        this.permissionsName = permissionsName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return this.permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPermissions (");

        sb.append(id);
        sb.append(", ").append(permissionsName);

        sb.append(")");
        return sb.toString();
    }
}
