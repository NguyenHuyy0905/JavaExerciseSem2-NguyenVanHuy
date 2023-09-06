public class Main {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp();
        SwitchButton switchButton = new SwitchButton();
        switchButton.connectToLamp(electricLamp);
        for (int i=1; i <= 10; i++) {
            switchButton.switchOn();
            switchButton.switchOff();
        }
    }
}