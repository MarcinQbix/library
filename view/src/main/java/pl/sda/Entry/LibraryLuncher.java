package pl.sda.Entry;

import lombok.ToString;
import pl.sda.Printers.LiberaryPrinetr;
import pl.sda.controller.AuthorControler;
import pl.sda.controller.BookControler;
import pl.sda.controller.BorrowControler;
import pl.sda.domain.Author;
import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.domain.Borrow;
import pl.sda.persisence.BookRepository;
import pl.sda.service.BookService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


@ToString
public class LibraryLuncher {
    //    public enum State {
//        START,
//        LOGGED_IN,
//        STOP
//    }
    public static void main(String[] args) throws IOException {

        LiberaryPrinetr.printloggedInMenu();
//        State state = State.START;
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                LiberaryPrinetr.printUserMenu();
                option = sc.nextInt();
                switch (option) {
                    case 1: {

                    }
                    case 2: {

                    }
                    case 3: {

                    }
                }

            }
            case 2: {
                LiberaryPrinetr.printLiberaryMenu();
                option = sc.nextInt();
                switch (option) {
                    case 1: {

                    }
                    case 2: {

                    }
                    case 3: {

                    }
                }

            }
        }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wybierz id czytalnika");

            BorrowControler borrowControler = new BorrowControler();

            AuthorControler authorControler = new AuthorControler();

//        authorControler.save("janek","kowal","nowa wieś");
//        authorControler.save("mak","rak","ptak");
//        authorControler.remove(Long.valueOf(2));
//        authorControler.read(Long.valueOf(1));

            List<Author> authors = authorControler.viewAll();
            for (int i = 0; i < authors.size(); i++) {
                System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());

            }
            System.out.println("Wbierz Autora któego chcesz zaktulizować ");
            int index = scanner.nextInt();
            scanner.nextLine();
            Author author = authors.get(index);
            System.out.println("Imię");
            String name = scanner.nextLine();
            author.setName(name.equals("") ? author.getName() : name);
            System.out.println("Nazwisko");
            String surname = scanner.nextLine();
            author.setSurname(surname.equals("") ? author.getSurname() : surname);
            authorControler.edit(author);
            for (int i = 0; i < authors.size(); i++) {
                System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
            }
            System.out.println("Wbierz Autora do którego chcesz dodać książkę ");
            BookControler bookControler = new BookControler();
            index = scanner.nextInt();
            Long authorID = authors.get(index).getAuthorID();
            Book book = new Book();
            book.setAuthorID(authorID);
            System.out.println("Wprowadź Tytuł książki");
            scanner.nextLine();
            String title = scanner.nextLine();
            book.setTitle(title);
            System.out.println("Wprwadz datę publikacji");
            String publishDate = scanner.nextLine();
            book.setDateOfPublis(publishDate);
            System.out.println("Wpisz numer ISBN ");
            Long isbn = scanner.nextLong();
            book.setIsbn(isbn);
            System.out.println("Wpisz ilość stron");
            Integer numbOfPage = scanner.nextInt();
            book.setNumOfPages(numbOfPage);
            System.out.println("Wpisz rodzaj książki");

            System.out.println(Arrays.toString(BooksType.values()));
            scanner.nextLine();
            BooksType booksType = BooksType.valueOf(scanner.nextLine().toUpperCase());
            book.setType(booksType);
            System.out.println("Dodatkowy Opis: ");
            String descirpt = scanner.nextLine();
            book.setDescript(descirpt);
            bookControler.addBook(book);
            System.out.println( bookControler.viewAllavaliable());



//        bookControler.addBook("W Pustyni i w puszczy","23.12.1800", 4343534L,500,"", BooksType.ROMANCE, authorID);
//        scanner.nextLine();
//        bookControler.addBook("W Pustyni i w puszczy","23.12.1800",Long.valueOf(4343534),500,"", BooksType.ROMANCE,Long.valueOf(index));


        }
    }

