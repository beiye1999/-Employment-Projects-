package com.by.pojo;

public class Creditlimit {
    private Integer clid;

    private Integer cluserid;

    private String clusername;

    private String crbankcard;

    private Double cllimit;

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public Integer getCluserid() {
        return cluserid;
    }

    public void setCluserid(Integer cluserid) {
        this.cluserid = cluserid;
    }

    public String getClusername() {
        return clusername;
    }

    public void setClusername(String clusername) {
        this.clusername = clusername == null ? null : clusername.trim();
    }

    public String getCrbankcard() {
        return crbankcard;
    }

    public void setCrbankcard(String crbankcard) {
        this.crbankcard = crbankcard == null ? null : crbankcard.trim();
    }

    public Double getCllimit() {
        return cllimit;
    }

    public void setCllimit(Double cllimit) {
        this.cllimit = cllimit;
    }
}