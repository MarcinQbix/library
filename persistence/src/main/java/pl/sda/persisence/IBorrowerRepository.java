package pl.sda.persisence;

import pl.sda.domain.Borrower;

import java.io.IOException;
import java.util.List;

public interface IBorrowerRepository {
    void removeBorrower(Long id)throws IOException;
    void add(Borrower borrower) throws IOException;
    Borrower read (Long id) throws IOException;
    void edit(Borrower borrower) throws IOException;
    List readALLBorrower() throws IOException;

}
