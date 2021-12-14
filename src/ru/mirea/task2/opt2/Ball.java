public class Ball {
    private String colour;
    private int weight;
    private int radius;

    public Ball(String colour, int radius, int weight) {
        this.colour = colour;
        this.radius = radius;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                ", radius=" + radius +
                '}';
    }
}
