package PR6;

import java.lang.*;

public class firstTask extends  Student{
    public firstTask(int ID, int GPA) {
        super(ID, GPA);
    }
    Student[] students = new Student[5];


    public void main(String args[]){
        int[] IDNumbers=new int[5];
        for (int i=0;i<5;i++){
            IDNumbers[i]=students[i].getID();
        }
        QuickSort q=new QuickSort() ;
        q.quickSort(IDNumbers,0,5);
    }
}