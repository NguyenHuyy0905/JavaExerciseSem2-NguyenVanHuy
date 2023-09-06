public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {};

    public void turnOff() {
        this.status = false;
    }

    public void turnOn() {
        this.status = true;
    }
}
