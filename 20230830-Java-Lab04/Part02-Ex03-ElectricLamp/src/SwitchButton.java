public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {}

    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOff() {
        this.lamp.turnOff();
    }

    public void switchOn() {
        this.lamp.turnOn();
    }
}
