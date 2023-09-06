public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + getPerimeter() * height;
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius() + ", Color: " + getColor() + ", Height: " + height + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
