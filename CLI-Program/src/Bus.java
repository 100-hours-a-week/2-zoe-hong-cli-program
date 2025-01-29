public class Bus extends Vehicle {
    String busNumber;

    public Bus(int duration, int charge, String busNumber) {
        super(duration, charge);
        this.busNumber = busNumber;
    }

    String isBus() {
        return busNumber + "번 버스";
    }
}
