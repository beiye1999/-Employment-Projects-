package com.by.pojo;

import java.util.Date;

public class Recharge {
    private Integer rid;

    private Integer uid;

    private String uname;

    private String czlx;

    private String lsh;

    private String czmoney;

    private String fl;

    private String dzmoney;

    private Date cztime;

    private String statu;

    private String zname;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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

    public String getCzlx() {
        return czlx;
    }

    public void setCzlx(String czlx) {
        this.czlx = czlx == null ? null : czlx.trim();
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public String getCzmoney() {
        return czmoney;
    }

    public void setCzmoney(String czmoney) {
        this.czmoney = czmoney == null ? null : czmoney.trim();
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl == null ? null : fl.trim();
    }

    public String getDzmoney() {
        return dzmoney;
    }

    public void setDzmoney(String dzmoney) {
        this.dzmoney = dzmoney == null ? null : dzmoney.trim();
    }

    public Date getCztime() {
        return cztime;
    }

    public void setCztime(Date cztime) {
        this.cztime = cztime;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }
}