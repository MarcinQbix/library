package pl.sda.persisence;

import pl.sda.domain.Borrow;

import java.io.IOException;

public interface IBorrowRepository {
    Borrow addBorrow (Borrow borrow) throws IOException;
}
