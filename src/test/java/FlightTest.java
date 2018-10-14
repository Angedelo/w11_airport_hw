import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane planeOne;
    Flight flightOne;

    @Before
    public void before(){
        planeOne = new Plane(Type.BOEING747, "KLM");
        flightOne = new Flight(001, "Chicago");
    }

    @Test
    public void hasFlightNum(){
        assertEquals(001, flightOne.getFlightNum());
    }
    @Test
    public void hasDestination(){
        assertEquals("Chicago", flightOne.getDestination());
    }
    @Test
    public void canAddPlaneToFlight(){
        assertEquals(planeOne, flightOne.addPlane(planeOne));
        assertEquals(planeOne, flightOne.getPlane());
    }

}
