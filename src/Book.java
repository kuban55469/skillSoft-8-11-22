public class Book extends Author{
    private String name;
    private Author author;
    private int prise;
    private int qty;

    public Book(){

    }
    public Book(String name, Author author, int prise, int qty) {
        super();
        this.name = name;
        this.prise = prise;
        this.author = author;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book= " +
                " Name: " + name +
                ", Author: " + author +
                ", Prise: " + prise +
                ", qty: " + qty;
    }
}
