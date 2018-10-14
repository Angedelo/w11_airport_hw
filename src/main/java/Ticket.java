public class Ticket {
    private Passenger passenger;
    private Flight flight;

    public Ticket(Flight flight){
        this.passenger = passenger;
        this.flight = flight;
    }


    public Flight getFlight() {
        return this.flight;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void addPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
