package pl.sda.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Book;
import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;
import pl.sda.persisence.BookRepository;
import pl.sda.persisence.IBookRepository;
import pl.sda.persisence.IBorrowRepository;
import pl.sda.persisence.IBorrowerRepository;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class BorrowService implements IBorrowService {
    private IBookRepository bookRepository;
    private IBorrowerRepository borrowerRepository;
    private IBorrowRepository borrowRepository;

    public BorrowService(IBorrowRepository borrowRepository, IBorrowerRepository borrowerRepository, IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.borrowerRepository = borrowerRepository;
        this.borrowRepository = borrowRepository;
    }

    @Override
    public void borrowBook(Borrow borrow) throws IOException {
        Long borrowerId = borrow.getBorrowerID();
        Long bookID = borrow.getBookID();
//    Borrower borrower = Optional.ofNullable(borrowerRepository.read(borrowerId))
//            .orElse(() ->{
//                LOGGER.error("[Can not find borrower] Id:{)",borrowerId);
//                return new BorrowerNotFoundException("Can not find borrower");
//            }

        borrow.setDateOfBorrow(LocalDate);


    }
}
