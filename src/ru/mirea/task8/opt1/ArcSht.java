package ru.mirea.task8.opt1;

import java.awt.*;

public class ArcSht extends Shape{
    public ArcSht(int x, int y, Color colour) {
        super(x, y, colour);
    }

    public void Print(Graphics g)
    {

        g.setColor(getColour());
        g.fillArc(
                getX(),
                getY(),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 300),
                10 + (int) (Math.random() * 300));
    }

}
