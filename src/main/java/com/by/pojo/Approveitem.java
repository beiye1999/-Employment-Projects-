package com.by.pojo;

public class Approveitem {
    private Integer aiid;

    private String ainame;

    private String aitype;

    private String aistate;

    public Integer getAiid() {
        return aiid;
    }

    public void setAiid(Integer aiid) {
        this.aiid = aiid;
    }

    public String getAiname() {
        return ainame;
    }

    public void setAiname(String ainame) {
        this.ainame = ainame == null ? null : ainame.trim();
    }

    public String getAitype() {
        return aitype;
    }

    public void setAitype(String aitype) {
        this.aitype = aitype == null ? null : aitype.trim();
    }

    public String getAistate() {
        return aistate;
    }

    public void setAistate(String aistate) {
        this.aistate = aistate == null ? null : aistate.trim();
    }
}