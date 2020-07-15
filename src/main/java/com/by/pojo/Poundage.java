package com.by.pojo;

import java.util.Date;

public class Poundage {
    private Integer pid;

    private Integer uid;

    private String uname;

    private String zname;

    private String sxmoney;

    private String what;

    private Date sxtime;

    private String localaccount;

    private String bookaccount;

    private String paytype;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public String getSxmoney() {
        return sxmoney;
    }

    public void setSxmoney(String sxmoney) {
        this.sxmoney = sxmoney == null ? null : sxmoney.trim();
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what == null ? null : what.trim();
    }

    public Date getSxtime() {
        return sxtime;
    }

    public void setSxtime(Date sxtime) {
        this.sxtime = sxtime;
    }

    public String getLocalaccount() {
        return localaccount;
    }

    public void setLocalaccount(String localaccount) {
        this.localaccount = localaccount == null ? null : localaccount.trim();
    }

    public String getBookaccount() {
        return bookaccount;
    }

    public void setBookaccount(String bookaccount) {
        this.bookaccount = bookaccount == null ? null : bookaccount.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }
}