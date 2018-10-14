public class Ticket {
    private Passenger passenger;
    private Flight flight;

    public Ticket(Passenger passenger, Flight flight){
        this.passenger = passenger;
        this.flight = flight;
    }


    public Flight getFlight() {
        return this.flight;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }
}
