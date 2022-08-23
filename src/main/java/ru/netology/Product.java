package ru.netology;

public class Product {
    protected int id;
    protected int price;
    protected String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTooExpensive() {
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }
    }

    public void use() {

        System.out.println("Продукт " + name + " используется");
    }
}
