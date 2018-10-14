import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;
    Plane planeOne;
    Plane planeTwo;
    Plane planeThree;
    Passenger passengerOne;
    Passenger passengerTwo;

    @Before
    public void before(){
        passengerOne = new Passenger("Alice", "Chicago");
        passengerTwo = new Passenger("Seamus", "Wigan");
        planeOne = new Plane(Type.HAIRDRYER, "KLM");
        planeTwo = new Plane(Type.BOEING747, "KLM");
        planeThree = new Plane(Type.AIRBUSA380, "KLM");
        airport = new Airport("EDI");
        airport.addPlaneToHangar(planeOne);
        airport.addPlaneToHangar(planeTwo);
    }

    @Test
    public void hasCode(){
        assertEquals("EDI", airport.getCode());
    }

    @Test
    public void flightCount(){
        assertEquals(0, airport.getFlights().size());
    }

    @Test
    public void availablePlaneCount(){
        assertEquals(2, airport.getAvailablePlanes().size());
    }

    @Test
    public void bookedPlaneCount(){
        assertEquals(0, airport.getBookedPlanes().size());
    }

    @Test
    public void spareTicketCount(){
        assertEquals(0, airport.getSpareTickets().size());
    }

    @Test
    public void canAddPlanesToHangar(){
        airport.addPlaneToHangar(planeThree);
        assertEquals(3, airport.getAvailablePlanes().size());
    }

    @Test
    public void canCreateFlight(){
        airport.createFlight(9, "Chicago");
        assertEquals(1, airport.getFlights().size());
    }

    @Test
    public void canAddPlaneFromHangarToFlight(){
        airport.createFlight(9, "Chicago");
//        flight now in flights arraylist & planes already in hangar so no arguments needed to add to flight
        airport.addPlaneToFlight();
        assertEquals(1, airport.getAvailablePlanes().size());
        assertEquals(1, airport.getBookedPlanes().size());
    }

    @Test
    public void canCreateTicketsForFlight(){
        airport.createFlight(9, "Chicago");
        airport.addPlaneToFlight();
        airport.createTickets();
        assertEquals(3, airport.getSpareTickets().size());
    }

    @Test
    public void canSellTickets(){
        airport.createFlight(9, "Chicago");
        airport.addPlaneToFlight();
        airport.createTickets();
        airport.sellTicket(passengerOne);
        assertEquals(1, airport.getSoldTickets());
        assertEquals(2, airport.getSpareTickets().size());
    }
}
