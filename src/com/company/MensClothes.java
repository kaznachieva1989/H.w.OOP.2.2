package com.company;

public class MensClothes extends Clothes implements Printable {
    private String color;
    private String quality;

    public MensClothes(String name, String season, String color, String quality) {
        super(name, season);
        this.color = color;
        this.quality = quality;
    }

    public String getColor() {
        return color;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getSeason() + " " + color + " " + quality);
    }
}
