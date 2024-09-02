package com.shsh.superchaining;

public class Train {
    private String no;
    private String source;

    public Train(String no, String source) {
        this.no = no;
        this.source = source;
    }

    public void printDetails() {
        System.out.println("Train No: " + no);
        System.out.println("Source: " + source);
    }

    public Train copy() {
        return new Train(no, source);
    }
}
