package PR6;

import java.util.Arrays;
public class Student {
    private int ID;
    private int GPA;

    public Student(int ID,int GPA) {
        this.ID = ID;
        this.GPA=GPA;
    }

    public Student() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}