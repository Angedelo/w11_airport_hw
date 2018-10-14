import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane planeOne;

    @Before
    public void before(){
        planeOne = new Plane(Type.BOEING747, "KLM");
    }

    @Test
    public void hasType(){
        assertEquals(Type.BOEING747, planeOne.getType());
    }
}
