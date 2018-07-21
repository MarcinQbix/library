package pl.sda.Entry;

import pl.sda.controller.AuthorControler;
import pl.sda.domain.Author;

import java.io.IOException;

public class LibraryLuncher {
    public static void main(String[] args) throws IOException {
        AuthorControler authorControler = new AuthorControler();
//        authorControler.save("janek","kowal","nowa wieś");
//        authorControler.save("mak","rak","ptak");
        authorControler.remove(Long.valueOf(2));

    }
}
