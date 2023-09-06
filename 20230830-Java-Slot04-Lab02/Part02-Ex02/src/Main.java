public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        for(int i = 1; i <= 10; i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        System.out.println(flashLamp.getBatteryInfo());
    }
}