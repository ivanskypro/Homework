package ru.pro.sky;

public class Author {
      String firstName;
      String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void SetSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String GetFirstName() {
        return this.firstName;
    }

    public String GetSecondName() {
        return this.secondName;
    }
}
