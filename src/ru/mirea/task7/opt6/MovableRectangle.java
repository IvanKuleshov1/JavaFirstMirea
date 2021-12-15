package ru.mirea.task7.opt6;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, MovablePoint topLeft, MovablePoint bottomRight) {
        super(x, y, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp(){
        //if(!checkSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n");

        y+=ySpeed;
    }
    @Override
    public void moveDown(){
        //if(!checkSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n");

        y-=ySpeed;
    }
    @Override
    public void moveLeft(){
        //if(!checkSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n");

        x-=xSpeed;
    }

    @Override
    public void moveRight(){
        //if(!checkSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n");

                x+=xSpeed;
    }
    public String checkSpeed(){
        //if(Math.abs(bottomRight.x-topLeft.x)!=Math.abs(xSpeed) || Math.abs(bottomRight.y-topLeft.y)!=Math.abs(ySpeed) );
        if(Math.abs(bottomRight.x-topLeft.x)!=Math.abs(x) || Math.abs(bottomRight.y-topLeft.y)!=Math.abs(y) )           //и так пойдет(если что фиксить конструкторы по тз)
            {
            return "bottomRight.x=" + bottomRight.x + '\n' +
                    "bottomRight.y=" + bottomRight.y + '\n' +
                    "topLeft.x=" + topLeft.x + '\n' +
                    "topLeft.y=" + topLeft.y + '\n' +
                    "x=" + x + '\n' +
                    "y=" + y + '\n' +


                    "Скорости точек прямоугольника не совпадают!\n";
            }
        else {
            return "ok.";
        }
    }
}
