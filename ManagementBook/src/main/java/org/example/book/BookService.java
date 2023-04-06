package org.example.book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public Book[] filterBooksByAuthor(Author auteur, Book[] livres) {

        for (Book book: livres) {
            for (Author author: book.authors) {
                if(author == auteur){

                }
            }
        }
        return null;
    }


}
