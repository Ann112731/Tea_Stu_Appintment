package com.jubilantz.entity;

import java.io.Serializable;

public class EasHomeWork implements Serializable {
    private int id;
    private int stuid;
    private int teaid;
    private String workpath;
    private double workscore;
    private String workname;

    public EasHomeWork() {
    }

    public EasHomeWork(int id, int stuid, int teaid, String workpath, double workscore, String workname) {
        this.id = id;
        this.stuid = stuid;
        this.teaid = teaid;
        this.workpath = workpath;
        this.workscore = workscore;
        this.workname = workname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getTeaid() {
        return teaid;
    }

    public void setTeaid(int teaid) {
        this.teaid = teaid;
    }

    public String getWorkpath() {
        return workpath;
    }

    public void setWorkpath(String workpath) {
        this.workpath = workpath;
    }

    public double getWorkscore() {
        return workscore;
    }

    public void setWorkscore(double workscore) {
        this.workscore = workscore;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }
}