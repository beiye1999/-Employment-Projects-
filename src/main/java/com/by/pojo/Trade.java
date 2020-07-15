package com.by.pojo;

import java.util.Date;

public class Trade {
    private Integer tid;

    private Integer uid;

    private String uname;

    private String zname;

    private String jymoney;

    private String what;

    private Date jytime;

    private String other;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }

    public String getJymoney() {
        return jymoney;
    }

    public void setJymoney(String jymoney) {
        this.jymoney = jymoney == null ? null : jymoney.trim();
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what == null ? null : what.trim();
    }

    public Date getJytime() {
        return jytime;
    }

    public void setJytime(Date jytime) {
        this.jytime = jytime;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}