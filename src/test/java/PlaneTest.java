import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Passenger passengerOne;
    Plane planeOne;
    Plane planeTwo;

    @Before
    public void before(){
        passengerOne = new Passenger("Alice Rees", "Bhutan");
        planeOne = new Plane(Type.BOEING747, "KLM");
        planeTwo = new Plane(Type.HAIRDRYER, "BA");
    }

    @Test
    public void hasType(){
        assertEquals(Type.BOEING747, planeOne.getType());
    }

    @Test
    public void hasAirline(){
        assertEquals("KLM", planeOne.getAirline());
    }

    @Test
    public void hasCapacity(){
        assertEquals(250, planeOne.getType().getCapacity());
    }

    @Test
    public void canAddPassengerIfBelowCapacity(){
        assertEquals("Welcome aboard", planeOne.addPassenger(passengerOne));
    }

    @Test
    public void cannotAddPassengerIfAtCapacity(){
        planeTwo.addPassenger(passengerOne);
        planeTwo.addPassenger(passengerOne);
        planeTwo.addPassenger(passengerOne);
        assertEquals("Sorry, no room at the inn", planeTwo.addPassenger(passengerOne));
    }
}
