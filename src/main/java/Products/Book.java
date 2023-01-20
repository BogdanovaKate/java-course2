package Products;

public class Book extends Product{
    private final String author;
    private final String name;
    private final int publishedYear;

    public Book(String author, String name, int publishedYear, double regularPrice) {
        super(regularPrice);
        this.author = author;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice()*0.8;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
