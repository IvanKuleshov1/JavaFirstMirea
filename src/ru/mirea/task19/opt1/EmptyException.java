package ru.mirea.task19.opt1;

public class EmptyException extends Exception {
    private String request = "Повторите ввод";

    public EmptyException(String message) {
        super(message);
        System.out.println(request);
    }
}