package pl.sda.Entry;

import lombok.ToString;
import pl.sda.controller.AuthorControler;
import pl.sda.domain.Author;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@ToString
public class LibraryLuncher {
    public static void main(String[] args) throws IOException {
        AuthorControler authorControler = new AuthorControler();
        Scanner scanner = new Scanner(System.in);
//        authorControler.save("janek","kowal","nowa wieś");
//        authorControler.save("mak","rak","ptak");
//        authorControler.remove(Long.valueOf(2));
//        authorControler.read(Long.valueOf(1));
        List<Author> authors=authorControler.viewAll();
        for(int i = 0; i<authors.size();i++){
            System.out.println(i+ " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
        }
        System.out.println("Wbierz Autora któego chcesz zaktulizować ");
        int index = scanner.nextInt();
        scanner.nextLine();
        Author author = authors.get(index);
        System.out.println("Imię");
        String name= scanner.nextLine();
        author.setName(name.equals("")? author.getName(): name);
        System.out.println("Nazwisko");
        String surname= scanner.nextLine();
        author.setSurname(surname.equals("")? author.getSurname():surname);
        authorControler.edit(author);

    }
}
