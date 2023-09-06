class Circle implements IShape {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return 3.14 * radious * radious;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radious;
    }
}