package com.company;

public class Babywear extends Clothes implements Printable {
    private int size;
    private String gender;

    public Babywear(String name, String season, int size, String gender) {
        super(name, season);
        this.size = size;
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getSeason() + " " + size + " " + gender);
    }
}
