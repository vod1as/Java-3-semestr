package PR1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("1 volume 'War and Peace'", 212);
        Book b2 = new Book("2 volume 'War and Peace'", 148);
        Book b5 = new Book("3 volume 'War and Peace'", 133);
        Book b4 = new Book("4 volume 'War and Peace'", 168);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b5);
        System.out.println(b4);
        b1.intoAllPages();
        b2.intoAllPages();
        b5.intoAllPages();
        b4.intoAllPages();
    }
}
