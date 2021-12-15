package ru.mirea.task4.opt1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public char getGender() {
        return gender;
    }*/

    public void setGender(char gender) {
        this.gender = gender;
    }

    //@Override
    public String toString() {
        return  '\n' + this.name + " (" + this.gender + ") at " + this.email ;
    }
}
