package ru.netology;

public class Book extends Product { // extends означает, что класс Книга - наследник класса Продукт

    private String author;
    private int pages;
    private int publishedYear;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Book(int id, String name, int price, String author, int pages, int publishedYear) {
        super(id, price, name); // означает, что обращаюсь к родительскому классу
        this.author = author;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    @Override        // эта аннотация позволяет избежать ошибки (опечатки) при написании метода,
    // который перезаписывает предыдущую версию
    public boolean isTooExpensive() {
        if (price > 2_000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void use() {
        System.out.println("Читает книгу " + name);
    }
}
