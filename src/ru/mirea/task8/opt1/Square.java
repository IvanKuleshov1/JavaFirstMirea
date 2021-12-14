package ru.mirea.task8.opt1;

import java.awt.*;

public class Square extends Shape{
    private GradientPaint grad;
    private int x;
    private int y;

    public Square( int x, int y, Color colour){
        super(x, y, colour);
    }
    public void Print(Graphics g)
    {
        g.setColor(getColour());
        g.fillRect(
                getX(),
                getY(),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500));
    }

}
