package ru.mirea.task12.opt1;

import ru.mirea.task12.Student;

public class TestStudent {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(12, 4),
                new Student(10, 5),
                new Student(189, 81),
                new Student(2, 320)
        };

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();
        // Вставки по id
        Student temp;
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            for (; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j + 1] = students[j];
            }
            students[j + 1] = current;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}