package ru.pro.sky;

public class Book {
    String bookName;
    Author authorName;
    int year;

    public Book(String bookName, Author name, int year) {
        this.bookName = bookName;
        this.authorName = name;
        this.year = year;

    }

    public String GetBookName() {
        return bookName;
    }

    public int GetYear() {
        return year;
    }

    public void SetYear(int year) {
        this.year = year;
    }
}
