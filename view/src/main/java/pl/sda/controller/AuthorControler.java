package pl.sda.controller;

import pl.sda.domain.Author;
import pl.sda.persisence.AuthorRepository;
import pl.sda.service.AuthorService;
import pl.sda.service.IAuthorService;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class AuthorControler {
    private IAuthorService authorService = new AuthorService();
    public void save(String firstName,String lastname,String placeofbirth) throws IOException {
        Author author = new Author();
        author.setName(firstName);
        author.setSurname(lastname);
        author.setPlaceOfBirth(placeofbirth);
        authorService.save(author);
    }
    public void remove(Long id) throws IOException {

        authorService.remove(id);
    }
}
