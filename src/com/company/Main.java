package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Babywear").print();
        createObject("WomansClothes").print();
        createObject("MensClothes").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Babywear":
                Babywear babywear = new Babywear("Боди", "Лето", 110, "для девочек");
                return babywear;
            case "WomansClothes":
                WomansClothes forwoman = new WomansClothes("Платье", "Осень", "Классика", "Шелк");
                return forwoman;
            case "MensClothes":
                MensClothes formen = new MensClothes("Брюки", "Зима", "Черный", "Высокое");
                return formen;
        }
        return printable;
    }
}
