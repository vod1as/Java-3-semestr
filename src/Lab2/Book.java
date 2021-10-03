package Lab2;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String a, String n, int y){
        author = a;
        name = n;
        year = y;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(String author) {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "Author: "+this.author+", the title of the book: "+this.name+", written in "+this.year;
    }
}