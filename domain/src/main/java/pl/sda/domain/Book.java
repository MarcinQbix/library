package pl.sda.domain;

public class Book {
    private Integer id;
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


}
