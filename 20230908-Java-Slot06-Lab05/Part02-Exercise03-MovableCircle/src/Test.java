public class Test {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(15, 27, 2, 2, 3);
        movableCircle.moveUp();
        movableCircle.moveUp();
        movableCircle.moveUp();
        movableCircle.moveUp();
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveLeft();
        movableCircle.moveRight();
        movableCircle.moveRight();
        movableCircle.moveRight();
        movableCircle.moveRight();
    }
}