package pl.sda.controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;
import pl.sda.service.BorrowerService;
import pl.sda.service.IBorrowerService;

import java.io.IOException;
import java.util.List;

public class BorrowerControler {
    private IBorrowerService borrowerService=new BorrowerService();
    public void addBorrower (Borrower borrower) throws IOException {
        borrowerService.create(borrower);
    }
    public void removeBorrower (Long id) throws IOException{
        borrowerService.removeBorrower(id);
    }
    public List<Borrower> readAllBorrowers() throws IOException {
        List<Borrower> borrowers= borrowerService.readALl();
        return borrowers;
    }
}
