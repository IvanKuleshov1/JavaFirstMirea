public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return getRadius()*2*3.14;
    }
    public double getAreaOfACircle(){
        return getRadius()*3.14*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Длина окружности="+getCircumference()+
                " Площадь окружности="+getAreaOfACircle()+

                '}';
    }
}
