package pl.sda.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
@Setter
public class Borrow {
   LocalDate dateOfBorrow;
   private Long borrowerID;
   private Long bookID;
   private Long borrowID;
}
