public class Vehicle {
    int duration;
    int charge;

    public Vehicle(int duration, int charge) {
        this.duration = duration;
        this.charge = charge;
    }

    String isDuration() {
        return "소요 시간(분): " + duration;
    }
    String isCharge() {
        return "교통 요금(원): " + charge;
    }
}
