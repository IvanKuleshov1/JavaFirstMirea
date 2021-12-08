package ru.mirea.task12.opt2;

import ru.mirea.task12.Student;

public class SortingStudentsByGPA {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(12, 320),
                new Student(10, 81),
                new Student(189, 5),
                new Student(2, 0)
        };

        for (Student s : students) {
            System.out.println(s);
        }

        // Быстрая по GPA
        System.out.println();
        boolean needIteration = true;
        Student temp;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < students.length; i++) {
                if (students[i].getGPA() < students[i - 1].getGPA()) {
                    temp = students[i];
                    students[i] = students[i-1];
                    students[i-1] = temp;
                    needIteration = true;
                }
            }
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}