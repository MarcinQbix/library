package pl.sda.Printers;

public class LiberaryPrinetr {
    public static void printloggedInMenu() {
        System.out.println("Witaj w bibliotece, co chcesz zrobić: ");
        System.out.println("Jeżeli chcesz sprawdzić swoje konto wpisz 1, jeżeli chcesz sprawdzić bazę biblioteki wpisz 2 " +
                "jeżeli chcesz wyjść wciśnij 3");
    }
    public static void printUserMenu(){
        System.out.println("Jeżeli chcesz wypożyczyć książkę wpisz 1, jeżeli chcesz oddać książkę wciśnij 2," +
                "Jeżeli chcesz sprawdzić swoje wypożyczenia wpisz 3, jeżeli chcesz wyjść wciśnij 4 ");
    }
    public static void printLiberaryMenu(){
        System.out.println("Jeżeli chcesz wyśtwietlić bazę książek wpisz 1, jeżeli chcesz wyśtwietlić bazę autorów wpisz 2" +
                "jeżeli chcesz wyjść wciśnij 3");
    }
    
}

