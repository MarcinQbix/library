package pl.sda.service;

import pl.sda.domain.Borrower;
import pl.sda.persisence.BorrowerRepository;
import pl.sda.persisence.IBorrowerRepository;

import java.io.IOException;
import java.util.List;

public class BorrowerService implements IBorrowerService{
    private IBorrowerRepository borrowerRepository= new BorrowerRepository();
    @Override
    public void removeBorrower(Long id) throws IOException {
    borrowerRepository.removeBorrower(id);
    }

    @Override
    public void create(Borrower borrower) throws IOException {
borrowerRepository.add(borrower);
    }

    @Override
    public Borrower read(Long id) throws IOException {
        return null;
    }

    @Override
    public void edit(Borrower borrower) throws IOException {

    }

    @Override
    public List<Borrower> readALl() throws IOException {
      List borrowers = borrowerRepository.readALLBorrower();
        return borrowers;
    }
}
