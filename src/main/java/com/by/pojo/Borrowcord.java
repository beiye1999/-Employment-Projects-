package com.by.pojo;

import java.util.Date;

public class Borrowcord {
    private Integer boid;

    private Integer bid;

    private Date bdate;

    private Integer bstatue;

    private Integer bcs;

    private String bz1;

    private String bz2;

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Integer getBstatue() {
        return bstatue;
    }

    public void setBstatue(Integer bstatue) {
        this.bstatue = bstatue;
    }

    public Integer getBcs() {
        return bcs;
    }

    public void setBcs(Integer bcs) {
        this.bcs = bcs;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1 == null ? null : bz1.trim();
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2 == null ? null : bz2.trim();
    }
}