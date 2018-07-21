package pl.sda.service;

import pl.sda.domain.Author;
import pl.sda.persisence.AuthorRepository;
import pl.sda.persisence.IAuthorRepository;

import java.io.IOException;

public class AuthorService implements IAuthorService {
    private IAuthorRepository authorRepository= new AuthorRepository();

    @Override
    public void save(Author author) throws IOException {
    authorRepository.save(author);
    }

    @Override
    public void remove(Long id) throws IOException {
        authorRepository.remove(id);
    }
}
