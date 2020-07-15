package com.by.pojo;

import java.util.Date;

public class Withdrawal {
    private Integer wid;

    private Integer uid;

    private String uname;

    private String zname;

    private String txnum;

    private String txbank;

    private String txmoney;

    private String dzmoney;

    private String sxf;

    private Date txtime;

    private Date zztime;

    private String statu;

    private String shwho;

    private Date shtime;

    private String nothing;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
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

    public String getTxnum() {
        return txnum;
    }

    public void setTxnum(String txnum) {
        this.txnum = txnum == null ? null : txnum.trim();
    }

    public String getTxbank() {
        return txbank;
    }

    public void setTxbank(String txbank) {
        this.txbank = txbank == null ? null : txbank.trim();
    }

    public String getTxmoney() {
        return txmoney;
    }

    public void setTxmoney(String txmoney) {
        this.txmoney = txmoney == null ? null : txmoney.trim();
    }

    public String getDzmoney() {
        return dzmoney;
    }

    public void setDzmoney(String dzmoney) {
        this.dzmoney = dzmoney == null ? null : dzmoney.trim();
    }

    public String getSxf() {
        return sxf;
    }

    public void setSxf(String sxf) {
        this.sxf = sxf == null ? null : sxf.trim();
    }

    public Date getTxtime() {
        return txtime;
    }

    public void setTxtime(Date txtime) {
        this.txtime = txtime;
    }

    public Date getZztime() {
        return zztime;
    }

    public void setZztime(Date zztime) {
        this.zztime = zztime;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public String getShwho() {
        return shwho;
    }

    public void setShwho(String shwho) {
        this.shwho = shwho == null ? null : shwho.trim();
    }

    public Date getShtime() {
        return shtime;
    }

    public void setShtime(Date shtime) {
        this.shtime = shtime;
    }

    public String getNothing() {
        return nothing;
    }

    public void setNothing(String nothing) {
        this.nothing = nothing == null ? null : nothing.trim();
    }
}