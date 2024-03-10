public class Book {
    private String name;
    private String author;
    private double price;
    private int publishYear;  //bileşenler

    //consturctor
    public Book(String name, String author, double price, int publishYear) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publishYear = publishYear;
    }

    //consturctor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.price = 0.0;

    }
//price setter diğerleri getter


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}