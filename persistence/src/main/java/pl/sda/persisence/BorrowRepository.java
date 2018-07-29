package pl.sda.persisence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Borrow;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BorrowRepository implements IBorrowRepository{
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BORROWS_DB_PATH = "C:\\Users\\Marcin\\Desktop\\RepositoryJAVA9KRK\\persistence\\src\\main\\resources\\database.authors\\borrowss.json";

    @Override
    public void addBorrow(Borrow borrow) throws IOException {
        List<Borrow> borrows = OBJECT_MAPPER.readValue(new File(BORROWS_DB_PATH), new TypeReference<List<Borrow>>() {
        });
        Long nextId = (long) (borrows.size() + 1);
        borrow.setBorrowID(nextId);
        borrows.add(borrow);
        OBJECT_MAPPER.writeValue(new File(BORROWS_DB_PATH), borrows);

    }
}
