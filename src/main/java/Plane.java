import java.util.ArrayList;

public class Plane {
    private Type type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, String airline){
        this.type = type;
        this.airline = airline;
    }

    public Type getType() {
        return this.type;
    }
}
