package pl.sda.service;

import pl.sda.domain.Author;

import java.io.IOException;

public interface IAuthorService   {
    void save(Author author) throws IOException;
    void remove(Long id) throws IOException;

}
