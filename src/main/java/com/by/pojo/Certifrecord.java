package com.by.pojo;

import java.util.Date;

public class Certifrecord {
    private Integer crid;

    private Integer cruserid;

    private String crusername;

    private Integer craiid;

    private String crainame;

    private String craitype;

    private String crispass;

    private Date crdate;

    private String crauditor;

    private Integer crintegral;

    private String crviewpoint;

    private String crimg;

    private Date crupldate;

    public Integer getCrid() {
        return crid;
    }

    public void setCrid(Integer crid) {
        this.crid = crid;
    }

    public Integer getCruserid() {
        return cruserid;
    }

    public void setCruserid(Integer cruserid) {
        this.cruserid = cruserid;
    }

    public String getCrusername() {
        return crusername;
    }

    public void setCrusername(String crusername) {
        this.crusername = crusername == null ? null : crusername.trim();
    }

    public Integer getCraiid() {
        return craiid;
    }

    public void setCraiid(Integer craiid) {
        this.craiid = craiid;
    }

    public String getCrainame() {
        return crainame;
    }

    public void setCrainame(String crainame) {
        this.crainame = crainame == null ? null : crainame.trim();
    }

    public String getCraitype() {
        return craitype;
    }

    public void setCraitype(String craitype) {
        this.craitype = craitype == null ? null : craitype.trim();
    }

    public String getCrispass() {
        return crispass;
    }

    public void setCrispass(String crispass) {
        this.crispass = crispass == null ? null : crispass.trim();
    }

    public Date getCrdate() {
        return crdate;
    }

    public void setCrdate(Date crdate) {
        this.crdate = crdate;
    }

    public String getCrauditor() {
        return crauditor;
    }

    public void setCrauditor(String crauditor) {
        this.crauditor = crauditor == null ? null : crauditor.trim();
    }

    public Integer getCrintegral() {
        return crintegral;
    }

    public void setCrintegral(Integer crintegral) {
        this.crintegral = crintegral;
    }

    public String getCrviewpoint() {
        return crviewpoint;
    }

    public void setCrviewpoint(String crviewpoint) {
        this.crviewpoint = crviewpoint == null ? null : crviewpoint.trim();
    }

    public String getCrimg() {
        return crimg;
    }

    public void setCrimg(String crimg) {
        this.crimg = crimg == null ? null : crimg.trim();
    }

    public Date getCrupldate() {
        return crupldate;
    }

    public void setCrupldate(Date crupldate) {
        this.crupldate = crupldate;
    }
}