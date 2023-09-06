import java.util.Scanner;

class Rectangle{
    private float length;
    private float width;
    Scanner sc = new Scanner(System.in);

    public void getInformation() {
        length = sc.nextFloat();
        width = sc.nextFloat();
    }

    public void display() {
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + 2 * (length + width));
    }

}

public class Entry {
    public static void main(String[]args) {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.display();
    }
}