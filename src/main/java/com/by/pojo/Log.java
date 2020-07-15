package com.by.pojo;

import java.util.Date;

public class Log {
    private Integer id;

    private String laccount;

    private String logtype;

    private String lremark;

    private Date lprocesstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLaccount() {
        return laccount;
    }

    public void setLaccount(String laccount) {
        this.laccount = laccount == null ? null : laccount.trim();
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getLremark() {
        return lremark;
    }

    public void setLremark(String lremark) {
        this.lremark = lremark == null ? null : lremark.trim();
    }

    public Date getLprocesstime() {
        return lprocesstime;
    }

    public void setLprocesstime(Date lprocesstime) {
        this.lprocesstime = lprocesstime;
    }
}