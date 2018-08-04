package pl.sda.controller;

import pl.sda.domain.Borrow;
import pl.sda.service.BorrowService;
import pl.sda.service.IBorrowService;

import java.io.IOException;

public class BorrowControler {
    private IBorrowService borrowService = new BorrowService();
public void borrowbook(Long borrowerID, Long bookID) throws IOException {
    Borrow borrow = new Borrow();
    borrow.setBorrowerID(borrowerID);
    borrow.setBookID(bookID);
    borrowService.borrowBook(borrow);
}
}
