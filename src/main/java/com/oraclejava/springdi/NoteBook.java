package com.oraclejava.springdi;

public class NoteBook {

    private int nid;
    private String brand; //갤럭시북


    public NoteBook() {
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
