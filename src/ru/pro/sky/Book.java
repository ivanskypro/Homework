package ru.pro.sky;

public class Book {
    private final String bookName;
    private final Author authorName;
    int year;

    public Book(String bookName, Author name, int year) {
        this.bookName = bookName;
        this.authorName = name;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
