package pl.sda.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Book;
import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;
import pl.sda.persisence.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class BorrowService implements IBorrowService {
    LocalDate today = LocalDate.now();
    private IBookRepository bookRepository = new BookRepository();
    private IBorrowerRepository borrowerRepository = new BorrowerRepository();
    private IBorrowRepository borrowRepository = new BorrowRepository();

    @Override
    public void borrowBook(Borrow borrow) throws IOException {
        Long borrowerId = borrow.getBorrowerID();
        Long bookID = borrow.getBookID();
//    Borrower borrower = Optional.ofNullable(borrowerRepository.read(borrowerId))
//            .orElse(() ->{
//                LOGGER.error("[Can not find borrower] Id:{)",borrowerId);
//                return new BorrowerNotFoundException("Can not find borrower");
//            }
//        Book book = Optional.ofNullable(bookRepository.read(bookID))
//                .orElseThrow(()->{
//                    LOGGER.error("[Can not find item] Id:{}",bookID);
//                    return new ItemNotFoundException("can not find item");
//    });
//        if(book.isBorrow()){
//            LOGGER.error("[Item has already beeen borrowed] Id :{}",bookID);
//            throw new IllegalAccessException("Item has already been borrowed");
//        }
        Borrower borrower = borrowerRepository.read(borrowerId);
        Book book = bookRepository.read(bookID);
        book.setBorrowed(true);
        borrow.setDateOfBorrow(today);
        Borrow savedBorrow= borrowRepository.addBorrow(borrow);
        book.setBorrowerName(borrower.getNameBrrower());
        bookRepository.edit(book);



    }
}
