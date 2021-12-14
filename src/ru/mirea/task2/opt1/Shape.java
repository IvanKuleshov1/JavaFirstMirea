public class Shape {
    private String name;
    private int angles;
    private int perimeter;
    private int square;


    public Shape(String name, int angles, int perimeter, int square) {
        this.name = name;
        this.angles = angles;
        this.perimeter = perimeter;
        this.square = square;
    }

    public String toString(){
        return("Название фигуры: " + this.name + " Количество углов: "+ this.angles + " Периметр фигуры: " + this.perimeter + " Площадь фигуры: " + this.square);
    }

}
