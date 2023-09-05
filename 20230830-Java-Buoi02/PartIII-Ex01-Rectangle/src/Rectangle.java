public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= width; j++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
