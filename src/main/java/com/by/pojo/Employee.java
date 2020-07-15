package com.by.pojo;

import java.util.Date;

public class Employee {
    private Integer eid;

    private String ename;

    private String esex;

    private Date ebirth;

    private String eidcard;

    private String ephone;

    private String email;

    private Integer edeptno;

    private String epostno;

    private Date etime;

    private Integer estatus;

    private String epassword;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex == null ? null : esex.trim();
    }

    public Date getEbirth() {
        return ebirth;
    }

    public void setEbirth(Date ebirth) {
        this.ebirth = ebirth;
    }

    public String getEidcard() {
        return eidcard;
    }

    public void setEidcard(String eidcard) {
        this.eidcard = eidcard == null ? null : eidcard.trim();
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getEdeptno() {
        return edeptno;
    }

    public void setEdeptno(Integer edeptno) {
        this.edeptno = edeptno;
    }

    public String getEpostno() {
        return epostno;
    }

    public void setEpostno(String epostno) {
        this.epostno = epostno == null ? null : epostno.trim();
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword == null ? null : epassword.trim();
    }
}