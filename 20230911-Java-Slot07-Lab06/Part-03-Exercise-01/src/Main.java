public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 1, 3);
        Triangle triangle2 = new Triangle(2, 2, 5);
        Triangle triangle3 = new Triangle(5, 6, 7);
        Triangle triangle4 = new Triangle(6, 7, 8);
        Triangle triangle5 = new Triangle(7, 8, 9);

        System.out.println("Diện tích tam giác thứ 5: " + triangle5.getArea());
    }
}