package org.example.book;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {

   /* public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }

        int matchBooksAmount = 0;
        for (Book book : books) {
            for (Author autor : book.getAuthors()) {
                if (autor.equals(author)) {
                    matchBooksAmount++;
                }
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            for (Author autor:book.getAuthors()) {
                if (autor.equals(author)) {
                    filteredBooks[index++] = book;
                }
            }

        }

        return filteredBooks;
    }*/

    public List<Book> filterBooksByAuthor(Author author, List<Book> books){

        List<Book> bookList = books.stream()
                .filter(b -> b.getAuthors() == author)
                .collect(Collectors.toList());


        return bookList;
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null) {
            return new Book[0];
        }

        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                filteredBooks[index++] = book;
            }
        }

        return filteredBooks;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            return new Book[0];
        }

        int matchBooksAmount = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                matchBooksAmount++;
            }
        }

        Book[] filteredBooks = new Book[matchBooksAmount];
        int index = 0;
        for (Book book : books) {
            if (book.getPublishingYear() >= yearFromInclusively) {
                filteredBooks[index++] = book;
            }
        }

        return filteredBooks;
    }
}
