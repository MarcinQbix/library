package pl.sda.service;

import pl.sda.domain.Author;

import java.io.IOException;
import java.util.List;

public interface IAuthorService {
    void save(Author author) throws IOException;

    void remove(Long id) throws IOException;

    Author read(Long id) throws IOException;

    void edit(Author author) throws IOException;

    List readALl() throws IOException;

}
