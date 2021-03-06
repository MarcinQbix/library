package pl.sda.persisence;

import com.sun.javafx.collections.MappingChange;
import pl.sda.domain.Author;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IAuthorRepository {
    void save(Author author) throws IOException;

    void remove(Long id) throws IOException;

    Author read(Long id) throws IOException;

    void edit(Author author) throws IOException;

    List readALL() throws IOException;

//     find(Author author) return

}
