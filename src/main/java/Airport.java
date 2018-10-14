import java.util.ArrayList;
import java.util.BitSet;

public class Airport {
    private ArrayList<Plane> availablePlanes;
    private ArrayList<Plane> bookedPlanes;
    private String code;
    private ArrayList<Ticket> spareTickets;
    private ArrayList<Flight> flights;

    public Airport(String code){
        this.code = code;
        this.availablePlanes = new ArrayList<>();
        this.bookedPlanes = new ArrayList<>();
        this.spareTickets = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public String getCode() {
        return this.code;
    }

    public ArrayList getFlights() {
        return flights;
    }

    public ArrayList getAvailablePlanes() {
        return availablePlanes;
    }

    public ArrayList getBookedPlanes() {
        return bookedPlanes;
    }

    public void addPlaneToHangar(Plane planeOne) {
        availablePlanes.add(planeOne);
    }

    public void createFlight(int flightNum, String destination) {
        Flight flight = new Flight(flightNum, destination);
        flights.add(flight);
    }

    public void addPlaneToFlight() {
        Plane plane = availablePlanes.remove(0);
        Flight flight = flights.get(flights.size() -1);
        flight.addPlane(plane);
        bookedPlanes.add(plane);
    }
}
