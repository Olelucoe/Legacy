package ru.netology;

public class Stockings extends Product { // extends означает, что класс Чулки - наследник класса Продукт

    private String color;
    private String type;
    private String size;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public Stockings(int id, String name, int price, String color, String type, String size) {
        super(id, price, name);
        this.color = color;
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 1_500) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void use() {
        System.out.println("Носит чулки " + name);
    }
}
