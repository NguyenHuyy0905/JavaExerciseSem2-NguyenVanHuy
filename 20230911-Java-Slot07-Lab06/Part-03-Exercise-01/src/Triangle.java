public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        try {
            validate(edge1, edge2, edge3);
        } catch (InvalidTriangleException e) {
            System.out.println("Nhập cạnh chưa đúng.");
        }
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    static void validate(double edge1, double edge2, double edge3) throws InvalidTriangleException {
        if (edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1) {
            throw new InvalidTriangleException("Not valid !");
        } else {
            System.out.println("Nhập cạnh hợp lệ.");
        }
    }

    public double getArea() {
        double p = (edge1 + edge2 + edge3) / 2;
        return Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
    }
}
