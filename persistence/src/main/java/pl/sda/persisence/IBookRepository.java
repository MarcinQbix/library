package pl.sda.persisence;

import pl.sda.domain.Author;
import pl.sda.domain.Book;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {
    void removeBook(Long id)throws IOException;
    void create(Book book) throws IOException;
    Book read (Long id) throws IOException;
    void edit(Book book) throws IOException;
    List readALL() throws IOException;



}
