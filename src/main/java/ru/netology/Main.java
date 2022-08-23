package ru.netology;

public class Main {
    public static void main(String[] args) {

        Product book = new Book(12,
                "Ветра зимы",
                790,
                "Джордж Мартин",
                585,
                2023);

        System.out.println("Моя жена: ");
        book.use();


        Product stockings = new Stockings(348,
                "Incanto",
                999,
                "red",
                "fishnet",
                "S");

        stockings.use();


    }

}