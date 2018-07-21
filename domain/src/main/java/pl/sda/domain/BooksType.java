package pl.sda.domain;

public enum  BooksType {
    SCIENCE_FICTION("Scince Fiction"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    TRAVEL("Travel"),
    SCIENCE("Science"),
    HISTORY("History"),
    FANTASY("Fantasy");
    private String text;
    BooksType(String test){
        this.text=text;
    }
    public String getText(){return text;}

}
