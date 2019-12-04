package com.company;

public class WomansClothes extends Clothes implements Printable {
    private String style;
    private String material;

    public WomansClothes(String name, String season, String style, String material) {
        super(name, season);
        this.style = style;
        this.material = material;
    }

    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void print() {
        System.out.println(this.getName() + " " + this.getSeason() + " " + style + " " + material);
    }
}
