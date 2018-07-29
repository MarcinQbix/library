package pl.sda.service;



import pl.sda.domain.Borrower;

import java.io.IOException;
import java.util.List;

public interface IBorrowerService {
    void removeBorrower(Long id)throws IOException;
    void create(Borrower borrower) throws IOException;
    Borrower read (Long id) throws IOException;
    void edit(Borrower borrower) throws IOException;
    List<Borrower> readALl() throws IOException;
}
