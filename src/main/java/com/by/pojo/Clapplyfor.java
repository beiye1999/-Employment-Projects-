package com.by.pojo;

import java.util.Date;

public class Clapplyfor {
    private Integer clpid;

    private String clpubcid;

    private String clpuname;

    private Double clpporiginal;

    private String clpidpaper;

    private String clphpoc;

    private Double clpf;

    private Date clpdate;

    private String clpauditor;

    private String clpstate;

    public Integer getClpid() {
        return clpid;
    }

    public void setClpid(Integer clpid) {
        this.clpid = clpid;
    }

    public String getClpubcid() {
        return clpubcid;
    }

    public void setClpubcid(String clpubcid) {
        this.clpubcid = clpubcid == null ? null : clpubcid.trim();
    }

    public String getClpuname() {
        return clpuname;
    }

    public void setClpuname(String clpuname) {
        this.clpuname = clpuname == null ? null : clpuname.trim();
    }

    public Double getClpporiginal() {
        return clpporiginal;
    }

    public void setClpporiginal(Double clpporiginal) {
        this.clpporiginal = clpporiginal;
    }

    public String getClpidpaper() {
        return clpidpaper;
    }

    public void setClpidpaper(String clpidpaper) {
        this.clpidpaper = clpidpaper == null ? null : clpidpaper.trim();
    }

    public String getClphpoc() {
        return clphpoc;
    }

    public void setClphpoc(String clphpoc) {
        this.clphpoc = clphpoc == null ? null : clphpoc.trim();
    }

    public Double getClpf() {
        return clpf;
    }

    public void setClpf(Double clpf) {
        this.clpf = clpf;
    }

    public Date getClpdate() {
        return clpdate;
    }

    public void setClpdate(Date clpdate) {
        this.clpdate = clpdate;
    }

    public String getClpauditor() {
        return clpauditor;
    }

    public void setClpauditor(String clpauditor) {
        this.clpauditor = clpauditor == null ? null : clpauditor.trim();
    }

    public String getClpstate() {
        return clpstate;
    }

    public void setClpstate(String clpstate) {
        this.clpstate = clpstate == null ? null : clpstate.trim();
    }
}