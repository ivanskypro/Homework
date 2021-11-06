package ru.pro.sky;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и Мир", author1, 1914);

        Author author2 = new Author("Джордж", "Оруэл");
        Book book2 = new Book("1984", author2, 1951);

        System.out.println("Год старого издания " + book2.getYear());

        book1.setYear(2015);
        System.out.println("Год нового издания " + book1.getYear());









    }
}
