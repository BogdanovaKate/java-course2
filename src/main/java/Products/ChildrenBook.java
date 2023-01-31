package Products;

public class ChildrenBook extends Book {
    public ChildrenBook(String author, String name, int publishedYear, double regularPrice) {
        super(author, name, publishedYear, regularPrice);
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice()*0.6;
    }

}
