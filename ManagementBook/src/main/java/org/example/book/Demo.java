package org.example.book;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {


    static Book[] books = new Book[]{
            new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1,
                    "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

            new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2,
                    "William", "Wilson") }, new Publisher(2, "Publisher_2 "), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

            /*new Book(3, "Livre_3", new Author[] { new Author(3, "Walter", "Peterson"), new Author(1, "Publisher_1"),1997, 350, BigDecimal.valueOf(34.99),
                CoverType.HARDCOUVERTURE),

            new Book( 4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Author(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK } ;
*/

    };

    public static void main() {

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }

        BookService bookService = new BookService();

        bookService.filterBooksByAuthor({ 1, "Jon", "Johnson"},books);

    }
}
