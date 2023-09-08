public class TestShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 3, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle("Blue", 2, 6);
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}