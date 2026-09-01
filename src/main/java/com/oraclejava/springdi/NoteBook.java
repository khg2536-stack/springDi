package com.oraclejava.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NoteBook {

    private int nid;
    private String brand; //갤럭시북


    public NoteBook() {

    }
    public NoteBook(int nid, String brand) {
        this.nid = nid;
        this.brand = brand;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNid() {
        return nid;
    }

    public String getBrand() {
        return brand;
    }
}
