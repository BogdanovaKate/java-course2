package Products;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, name, publishedYear);
    }
}
