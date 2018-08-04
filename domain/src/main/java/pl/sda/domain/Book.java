package pl.sda.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Book {
    private Long id;
    private String title;
    private String dateOfPublis;
    private Long isbn;
    private Integer numOfPages;
    private String descript;
    private BooksType type;
    private Borrower idBorrower;
    private long authorID;
    private Long borrowerID;
    private boolean removed;
    private boolean borrowed;
    private String borrowerName;

}
