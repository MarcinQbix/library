package pl.sda.controller;

import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.service.BookService;
import pl.sda.service.IBookService;

public class BookControler {
    private IBookService bookService = new BookService();
    public void addBook(String title, String dateofPublish, Long isbn, Integer numOfPages, String descript, BooksType type){
        Book book = new Book();

    }
}
