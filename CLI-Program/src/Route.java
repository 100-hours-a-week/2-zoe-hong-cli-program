public class Route extends Bus {
    String ride;
    String drop;

    public Route(int duration, int charge, String busNumber, String ride, String drop) {
        super(duration, charge, busNumber);
        this.ride = ride;
        this.drop = drop;
    }

    String isRideStop() {
        return "승차: " + ride;
    }
    String isDropStop() {
        return "하차: " + drop;
    }
}
