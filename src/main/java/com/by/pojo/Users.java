package com.by.pojo;

import java.util.Date;

public class Users {
    private Integer uid;

    private String unickname;

    private String uname;

    private String umailbox;

    private String uphonenumber;

    private Date uregisterdate;

    private String uflip;

    private Date ufldate;

    private String ureferrer;

    private String ureferrername;

    private String userpaytoid;

    private String ucertnumber;

    private String upassword;

    private String ucardid;

    private String uhead;

    private String upwdZd;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname == null ? null : unickname.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUmailbox() {
        return umailbox;
    }

    public void setUmailbox(String umailbox) {
        this.umailbox = umailbox == null ? null : umailbox.trim();
    }

    public String getUphonenumber() {
        return uphonenumber;
    }

    public void setUphonenumber(String uphonenumber) {
        this.uphonenumber = uphonenumber == null ? null : uphonenumber.trim();
    }

    public Date getUregisterdate() {
        return uregisterdate;
    }

    public void setUregisterdate(Date uregisterdate) {
        this.uregisterdate = uregisterdate;
    }

    public String getUflip() {
        return uflip;
    }

    public void setUflip(String uflip) {
        this.uflip = uflip == null ? null : uflip.trim();
    }

    public Date getUfldate() {
        return ufldate;
    }

    public void setUfldate(Date ufldate) {
        this.ufldate = ufldate;
    }

    public String getUreferrer() {
        return ureferrer;
    }

    public void setUreferrer(String ureferrer) {
        this.ureferrer = ureferrer == null ? null : ureferrer.trim();
    }

    public String getUreferrername() {
        return ureferrername;
    }

    public void setUreferrername(String ureferrername) {
        this.ureferrername = ureferrername == null ? null : ureferrername.trim();
    }

    public String getUserpaytoid() {
        return userpaytoid;
    }

    public void setUserpaytoid(String userpaytoid) {
        this.userpaytoid = userpaytoid == null ? null : userpaytoid.trim();
    }

    public String getUcertnumber() {
        return ucertnumber;
    }

    public void setUcertnumber(String ucertnumber) {
        this.ucertnumber = ucertnumber == null ? null : ucertnumber.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUcardid() {
        return ucardid;
    }

    public void setUcardid(String ucardid) {
        this.ucardid = ucardid == null ? null : ucardid.trim();
    }

    public String getUhead() {
        return uhead;
    }

    public void setUhead(String uhead) {
        this.uhead = uhead == null ? null : uhead.trim();
    }

    public String getUpwdZd() {
        return upwdZd;
    }

    public void setUpwdZd(String upwdZd) {
        this.upwdZd = upwdZd == null ? null : upwdZd.trim();
    }
}