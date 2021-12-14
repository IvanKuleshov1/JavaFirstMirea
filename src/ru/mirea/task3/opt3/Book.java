public class Book {
    private String name;
    private String author;
    private int year;
    private int pages;
    private String genre;
    private int cost;

    public Book(String name, String author, int year, int pages, String genre, int cost) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                '}';
    }
}
