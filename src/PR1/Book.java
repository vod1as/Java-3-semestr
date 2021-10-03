package PR1;

public class Book {
    private String name;
    private int pages;

    public Book(String n, int a){
        name = n;
        pages = 0;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int setPages() {
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }
    public void intoAllPages(){
        System.out.println(name+"'contains "+pages*250+" words.");
    }
}