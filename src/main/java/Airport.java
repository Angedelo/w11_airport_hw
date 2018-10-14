import java.util.ArrayList;
import java.util.BitSet;

public class Airport {
    private ArrayList<Plane> availablePlanes;
    private ArrayList<Plane> bookedPlanes;
    private String code;
    private ArrayList<Ticket> spareTickets;
    private ArrayList<Ticket> soldTickets;
    private ArrayList<Flight> flights;

    public Airport(String code){
        this.code = code;
        this.availablePlanes = new ArrayList<>();
        this.bookedPlanes = new ArrayList<>();
        this.spareTickets = new ArrayList<>();
        this.soldTickets = new ArrayList<>();
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

    public ArrayList<Ticket> getSpareTickets() {
        return spareTickets;
    }

    public int getSoldTickets() {
        return soldTickets.size();
    }

    public void createTickets() {
        Flight flight = flights.get(flights.size() -1);
        for (int i = 0; i < flight.getPlane().getType().getCapacity(); i++) {
            Ticket ticket = new Ticket(flight);
            spareTickets.add(ticket);
        }
    }

    public void sellTicket(Passenger passengerOne) {
        String passengerDestination = passengerOne.getDestination();
        for (int i = 0; i < spareTickets.size(); i++) {
//            need to check for destination on flight in each ticket and if matching passengerDestination
//            then remove that ticket from spare tickets, add passenger to that ticket, add it to sold tickets,
//            and then add it to the passenger.
        }
    }
}
