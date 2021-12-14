public class Square extends Rectangle{
    protected double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String colour, boolean filled, double side) {
        super(colour, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side=width;
    }
    public void setLength(double side){
        this.side=length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
