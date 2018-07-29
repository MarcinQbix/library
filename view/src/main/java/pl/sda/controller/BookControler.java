package pl.sda.controller;

import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.service.BookService;
import pl.sda.service.IBookService;

import java.io.IOException;
import java.util.List;

public class BookControler {
    private IBookService bookService = new BookService();
//    public void addBook(String title, String dateofPublish, Long isbn, Integer numOfPages, String descript, BooksType type, Long authorID) throws IOException {
//        Book book = new Book();
//        book.setAuthorID(authorID);
//        book.setTitle(title);
//        book.setDateOfPublis(dateofPublish);
//        book.setIsbn(isbn);
//        book.setNumOfPages(numOfPages);
//        book.setDescript(descript);
//        book.setType(type);
//        book.setAuthorID(authorID);
//        bookService.create(book);
//
//    }
    public void addBook(Book book) throws IOException {
        bookService.create(book);
    }
    public void remove (Long id) throws IOException{
        bookService.removeBook(id);
    }
    public List<Book> viewAll () throws IOException{
        List <Book> books = bookService.readALl();
        return books;
    }
    public List<Book>viewAllavaliable()throws IOException{
        List<Book>books =bookService.readALl();
        return books;
    }
    public  void edit(Book book) throws  IOException{
        bookService.edit(book);
    }
}
