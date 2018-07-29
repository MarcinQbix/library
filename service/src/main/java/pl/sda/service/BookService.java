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
        bookRepository.removeBook(id);

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
        bookRepository.edit(book);

    }

    @Override
    public List <Book> readALl() throws IOException {
        List  books=bookRepository.readALL();

        return books;
    }

    @Override
    public List<Book> readAllAvaliable() throws IOException {
        List books=bookRepository.readALL();
        for(int i=0;i<books.size();i++)
        {
            System.out.println(books.get(i));
        }
        return books;
    }
}
