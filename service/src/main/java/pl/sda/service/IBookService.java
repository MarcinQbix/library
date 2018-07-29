package pl.sda.service;

import pl.sda.domain.Book;

import java.io.IOException;
import java.util.List;

public interface IBookService {
    void removeBook(Long id)throws IOException;
    void create(Book book) throws IOException;
    Book read (Long id) throws IOException;
    void edit(Book book) throws IOException;
    List <Book> readALl() throws IOException;
    List<Book>readAllAvaliable() throws IOException;
}
