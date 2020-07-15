package com.by.pojo;

import java.util.Date;

public class Notice {
    private Integer noticeid;

    private String noticetitle;

    private String noticetype;

    private String noticepicture;

    private String noticecontent;

    private Date noticelasttime;

    private Integer noticelastmodifier;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    public String getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(String noticetype) {
        this.noticetype = noticetype == null ? null : noticetype.trim();
    }

    public String getNoticepicture() {
        return noticepicture;
    }

    public void setNoticepicture(String noticepicture) {
        this.noticepicture = noticepicture == null ? null : noticepicture.trim();
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent == null ? null : noticecontent.trim();
    }

    public Date getNoticelasttime() {
        return noticelasttime;
    }

    public void setNoticelasttime(Date noticelasttime) {
        this.noticelasttime = noticelasttime;
    }

    public Integer getNoticelastmodifier() {
        return noticelastmodifier;
    }

    public void setNoticelastmodifier(Integer noticelastmodifier) {
        this.noticelastmodifier = noticelastmodifier;
    }
}