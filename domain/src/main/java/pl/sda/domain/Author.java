package pl.sda.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private Long authorID;
    private String name;
    private String surname;
    private String placeOfBirth;
    boolean removed;

}
