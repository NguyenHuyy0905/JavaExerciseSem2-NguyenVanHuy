public class MovablePoint implements Movable {
    private static int x;
    private static int y;
    private final int xSpeed;
    private final int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        MovablePoint.x = x;
        MovablePoint.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        MovablePoint.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        MovablePoint.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ", x speed = " + xSpeed + ", y speed = " + ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
        System.out.println("x = " + x + ", y = " + y);
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
        System.out.println("x = " + x + ", y = " + y);
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
        System.out.println("x = " + x + ", y = " + y);
    }

    @Override
    public void moveRight() {
        x += xSpeed;
        System.out.println("x = " + x + ", y = " + y);
    }
}
