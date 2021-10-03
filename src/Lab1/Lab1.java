package Lab1;

public class Lab1 {
    public static void main(String[] args) {
        float b = 1;
        float a = 1;
        float c;

        System.out.println("Первые 10 цифр гармонического ряда =");

        while (b < 10) {
            c = a / b;
            b++;
            System.out.print(c + "  ");
        }
    }
}
