import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {
    Ticket ticket;
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Alice Rees", "Bhutan");
        flight = new Flight(001, "Chicago");
        ticket = new Ticket(flight);
    }

    @Test
    public void hasFlight(){
        assertEquals(flight, ticket.getFlight());
    }

    @Test
    public void canAddPassenger(){
        ticket.addPassenger(passenger);
        assertEquals(passenger, ticket.getPassenger());
    }
}
