package pl.sda.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Borrower {
    private Long idBorrower;
    private String nameBrrower;
    private String surnameBorrower;
    private String adresssBorrwoer;
    private Long phoneNr;
    private String emailBorrower;
}
