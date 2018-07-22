package pl.sda.persisence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Author;
import pl.sda.domain.Book;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BookRepository implements IBookRepository {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BOOKS_DB_PATH = "C:\\Users\\Marcin\\Desktop\\RepositoryJAVA9KRK\\persistence\\src\\main\\resources\\database.authors\\books\\books.json";
    @Override
    public void create (Book book) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Author>>() {
        });
        Long Nextid = Long.valueOf(books.size() + 1);
        book.setId(Nextid);
        OBJECT_MAPPER.writeValue(new File(BOOKS_DB_PATH), books);
    }

    @Override
    public void removeBook(Long id) throws IOException {

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
