package ru.mirea.task25.opt1;

public class ShapeDecorator implements Shape{
    public Shape shape;
    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
