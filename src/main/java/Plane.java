import java.util.ArrayList;

public class Plane {
    private Type type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(Type type, String airline){
        this.type = type;
        this.airline = airline;
        passengers = new ArrayList<>();

    }

    public Type getType() {
        return this.type;
    }

    public String getAirline() {
        return this.airline;
    }

    public String addPassenger(Passenger passenger) {
        if (passengers.size() < this.type.getCapacity()) {
            passengers.add(passenger);
            return "Welcome aboard";
        }
        return "Sorry, no room at the inn";
    }
}
