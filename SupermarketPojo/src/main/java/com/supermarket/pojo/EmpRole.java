package com.supermarket.pojo;

import java.io.Serializable;

public class EmpRole implements Serializable {
    private Integer eid;

    private Integer rid;

    private static final long serialVersionUID = 1L;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}