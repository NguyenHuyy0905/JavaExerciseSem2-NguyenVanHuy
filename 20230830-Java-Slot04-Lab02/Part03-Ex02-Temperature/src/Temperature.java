public class Temperature {
    private double cTemp;

    public Temperature() {}

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getCTemp() {
        return cTemp;
    }

    public void setCTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getFTemp() {
        return cTemp * 1.8 + 32;
    }

    public double getKTemp() {
        return cTemp + 273.15;
    }
}
