package pl.sda.persisence;

import pl.sda.domain.Book;

public interface IBookRepository {
    void removeBook(Long id);
    void create(Long id);



}
