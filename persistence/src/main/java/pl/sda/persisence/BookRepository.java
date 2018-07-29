package pl.sda.persisence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Author;
import pl.sda.domain.Book;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepository implements IBookRepository {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BOOKS_DB_PATH = "C:\\Users\\Marcin\\Desktop\\RepositoryJAVA9KRK\\persistence\\src\\main\\resources\\database.authors\\books\\books.json";
    @Override
    public void create (Book book) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Book>>() {
        });
        Long nextId = (long) (books.size() + 1);
        book.setId(nextId);
        books.add(book);
        OBJECT_MAPPER.writeValue(new File(BOOKS_DB_PATH), books);
    }

    @Override
    public void removeBook(Long id) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Book>>() {
        });
        for (Book a : books) {
            if (id.equals(a.getId()))
                a.setRemoved(true);
        }
        OBJECT_MAPPER.writeValue(new File(BOOKS_DB_PATH), books);
    }


    @Override
    public Book read(Long id) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Book>>() {
        });
        for (Book a : books) {
            id.equals(a.getId());
            System.out.println(a);
            return a;
        }
        return null;
    }

    @Override
    public void edit(Book book) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Author>>() {
        });
        int index=0;
        for(int i=0; i<=books.size();i++){
            if(book.getId().equals(books.get(i).getId())){
                index = i;
                break;
            }
        }
        books.set(index,book);
        OBJECT_MAPPER.writeValue(new File(BOOKS_DB_PATH),books);

    }


    @Override
    public List <Book>readALL() throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Book>>() {
        });
        return books;
    }
    @Override
    public List<Book> readALLavaliable() throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File(BOOKS_DB_PATH), new TypeReference<List<Book>>() {
        });
        return books.stream().filter(c->!c.isRemoved()).collect(Collectors.toList());


    }
}
