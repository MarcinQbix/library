package pl.sda.persisence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Borrower;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BorrowerRepository implements IBorrowerRepository {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BORROWERS_DB_PATH = "C:\\Users\\Marcin\\Desktop\\RepositoryJAVA9KRK\\persistence\\src\\main\\resources\\database.authors\\Borrowers.json";
    @Override
    public void removeBorrower(Long id) throws IOException {
        List<Borrower> borrowers = OBJECT_MAPPER.readValue(new File(BORROWERS_DB_PATH), new TypeReference<List<Borrower>>() {
        });
        for (Borrower a : borrowers) {
            if (id.equals(a.getIdBorrower()))
                borrowers.remove(a);
        }

        OBJECT_MAPPER.writeValue(new File(BORROWERS_DB_PATH), borrowers);
    }


    @Override
    public void add(Borrower borrower) throws IOException {
        List<Borrower> borrowers = OBJECT_MAPPER.readValue(new File(BORROWERS_DB_PATH), new TypeReference<List<Borrower>>() {
        });
        Long Nextid = Long.valueOf(borrowers.size() + 1);
        borrower.setIdBorrower(Nextid);
        borrowers.add(borrower);
        OBJECT_MAPPER.writeValue(new File(BORROWERS_DB_PATH), borrowers);
    }



    @Override
    public Borrower read(Long id) throws IOException {
        return null;
    }

    @Override
    public void edit(Borrower borrower) throws IOException {

    }

    @Override
    public List<Borrower> readALLBorrower() throws IOException {
        List<Borrower> borrowers = OBJECT_MAPPER.readValue(new File(BORROWERS_DB_PATH), new TypeReference<List<Borrower>>() {
        });
        return borrowers;
    }
}
