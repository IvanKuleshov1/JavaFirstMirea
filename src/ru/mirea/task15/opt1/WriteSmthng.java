package ru.mirea.task15.opt1;

import java.io.*;
import java.util.Scanner;

public class WriteSmthng {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;

        try(FileWriter writer = new FileWriter("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\test")) {
            System.out.println("Введите информацию, которую необходимо передать в текстовый файл");
            text = scanner.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}