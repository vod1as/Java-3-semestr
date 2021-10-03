package Lab2;

import java.lang.*;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book ("Stephen Edwin King", "The Green Mile", 1996);
        Book b2 = new Book ("Margaret Munnerlyn Mitchell", "Gone with the Wind", 1936);
        Book b3 = new Book ("Alexandre Dumas", "Le Comte de Monte-Cristo", 1846);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
