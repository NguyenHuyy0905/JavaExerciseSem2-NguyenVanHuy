public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setCTemp(25);
        System.out.println("K temperature: " + temperature.getKTemp());
        System.out.println("F temperature: " + temperature.getFTemp());
    }
}