package ru.mirea.task26.opt1;

public class BadSolvency implements Solvency {
    @Override
    public void disp() {
        System.out.println("Невозможно оказать услугу, кредитная история испорчена");
    }
}
