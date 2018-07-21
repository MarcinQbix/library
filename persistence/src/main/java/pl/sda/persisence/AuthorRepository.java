package pl.sda.persisence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Author;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepository implements IAuthorRepository {
    private static final ObjectMapper OBJECT_MAPPER= new ObjectMapper();
    private static final String AUTHOR_DB_PATH="C:\\Users\\Marcin\\Desktop\\RepositoryJAVA9KRK\\persistence\\src\\main\\resources\\database.authors\\authors.json";
    @Override
    public void save(Author author) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File(AUTHOR_DB_PATH), new TypeReference<List<Author>>(){});
        Long nextID= Long.valueOf(authors.size()+1);
        author.setAuthorID(nextID);
        authors.add(author);

        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH),authors);

    }


    @Override
    public void remove(Long id) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File(AUTHOR_DB_PATH), new TypeReference<List<Author>>(){});
        for(Author a: authors){
            if (id.equals(a.getAuthorID()))
                a.setRemoved(true);
        }
        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
//        authors.remove(author.getAuthorID());
    }

}
