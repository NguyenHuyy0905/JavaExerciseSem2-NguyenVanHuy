public class Main {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        // We can't use s.service()
        // But we can use downcasing to use
        ((LuxuryCar) c).service();
    }
}