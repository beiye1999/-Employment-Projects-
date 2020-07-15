package com.by.pojo;

import java.util.Date;

public class Dope {
    private Integer did;

    private Integer dprimkey;

    private String dtitle;

    private String details;

    private Date dtime;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDprimkey() {
        return dprimkey;
    }

    public void setDprimkey(Integer dprimkey) {
        this.dprimkey = dprimkey;
    }

    public String getDtitle() {
        return dtitle;
    }

    public void setDtitle(String dtitle) {
        this.dtitle = dtitle == null ? null : dtitle.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }
}