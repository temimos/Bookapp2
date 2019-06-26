package com.company;

public class Book {
    private String author;
    private String title;
    private double price;
    private String description;
    private String isbn;

    public Book() {
    }

    public Book(String author, String title, double price, String description, String isbn) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.description = description;
        setIsbn(isbn);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = fixIsbn(isbn);
    }
    private String fixIsbn(String isbn2)
    {
        return "ISBN: " +isbn2;
    }
    public String summary()
    {
        return author +" wrote a book about " + description + getIsbn();
    }
    private double pricePlusShipping()
    {
        return price + 5.00;
    }
    public String priceSummary(String phrase)
    {
        return phrase + String.valueOf(price +5.0);
    }
}
