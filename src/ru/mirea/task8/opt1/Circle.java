package ru.mirea.task8.opt1;

import java.awt.*;

public class Circle extends Shape{
    private Color colour;

    public Circle(int x, int y, Color colour) {
        super(x, y,colour);
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
    public Color getColour() {
        return colour;
    }

    public void Print(Graphics g)
    {
        g.setColor(getColour());
        g.fillOval(
                getX(),
                getY(),
                10 + (int) (Math.random() * 500),
                10 + (int) (Math.random() * 500));
    }

}