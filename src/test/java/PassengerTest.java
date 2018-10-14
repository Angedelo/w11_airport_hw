import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Alice Rees", "Bhutan");
    }

    @Test
    public void hasName(){
        assertEquals("Alice Rees", passenger.getName());
    }

    @Test
    public void hasDestination(){
        assertEquals("Bhutan", passenger.getDestination());
    }
}
