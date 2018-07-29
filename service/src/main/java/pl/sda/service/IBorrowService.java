package pl.sda.service;

import pl.sda.domain.Borrow;

import java.io.IOException;

public interface IBorrowService {
    public void borrowBook(Borrow borrow) throws IOException;
}
