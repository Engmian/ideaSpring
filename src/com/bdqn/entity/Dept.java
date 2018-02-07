package com.bdqn.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer did;
    private String dname;
    private String dhobby;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDhobby() {
        return dhobby;
    }

    public void setDhobby(String dhobby) {
        this.dhobby = dhobby;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dhobby='" + dhobby + '\'' +
                '}';
    }

    public Dept(Integer did, String dname, String dhobby) {
        this.did = did;
        this.dname = dname;
        this.dhobby = dhobby;
    }

    public Dept() {
    }
}
