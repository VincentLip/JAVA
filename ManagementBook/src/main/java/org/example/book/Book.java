package org.example.book;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {

    int id;
    String name;
    Author[] authors;
    Publisher publisher;
    int PublishingYears;
    int amoutOfPages;
    BigDecimal price;
    CoverType coverType;

    public Book() {
    }

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYears, int amoutOfPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        PublishingYears = publishingYears;
        this.amoutOfPages = amoutOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", PublishingYears=" + PublishingYears +
                ", amoutOfPages=" + amoutOfPages +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
