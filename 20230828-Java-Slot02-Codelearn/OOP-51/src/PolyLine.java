import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<Point>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        this.points.add(point);
    }

    public void appendPoint(int x, int y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int x2 = points.get(i+1).getX();
            int y1 = points.get(i).getY();
            int y2 = points.get(i+1).getY();

            double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            length += distance;
        }
        return length;
    }
}