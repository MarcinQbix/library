package pl.sda.service;

import pl.sda.domain.Book;
import pl.sda.persisence.BookRepository;
import pl.sda.persisence.IBookRepository;

import java.io.IOException;
import java.util.List;

public class BookService implements IBookService {
    private IBookRepository bookRepository= new BookRepository();

    @Override
    public void removeBook(Long id) throws IOException {

    }

    @Override
    public void create(Book book) throws IOException{
        bookRepository.create(book);
    }

    @Override
    public Book read(Long id) throws IOException {
        return null;
    }

    @Override
    public void edit(Book book) throws IOException {

    }

    @Override
    public List readALL() throws IOException {
        return null;
    }
}
