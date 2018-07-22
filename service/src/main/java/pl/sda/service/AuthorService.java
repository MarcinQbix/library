package pl.sda.service;

import pl.sda.domain.Author;
import pl.sda.persisence.AuthorRepository;
import pl.sda.persisence.IAuthorRepository;

import java.io.IOException;
import java.util.List;

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

    @Override
    public Author read(Long id) throws IOException {
      Author author =  authorRepository.read(id);
        return author;
    }

    @Override
    public void edit(Author author) throws IOException {
        authorRepository.edit(author);
    }

    @Override
    public List <Author> readALl() throws IOException {
        List  authors=authorRepository.readALL();
        return authors;
    }
}
