import java.util.ArrayList;

public class Passenger {
    private String name;
    private ArrayList<Ticket> myTickets;
    private String destination;

    public Passenger(String name, String destination) {
        this.name = name;
        this.destination = destination;
        myTickets = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getDestination() {
        return this.destination;
    }

//    need a buyTicket method that takes in the airport? and
//    looks for matching destination and takes a ticket and adds it to myTickets arraylist
}
