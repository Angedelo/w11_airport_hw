public class Flight {
    private int flightNum;
    private String destination;
    private Plane plane;

    public Flight(int flightNum, String destination){
        this.flightNum = flightNum;
        this.destination = destination;
    }


    public int getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public Plane addPlane(Plane planeOne) {
        return plane = planeOne;
    }
}
