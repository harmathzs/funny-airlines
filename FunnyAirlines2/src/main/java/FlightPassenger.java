public class FlightPassenger {
    // FlightNumber	Source	Destination	PassengerName	PassengerId	TicketID	SeatNumber	Price
    public String FlightNumber;
    public String Source;
    public String Destination;
    public String PassengerName;
    public int PassengerId;
    public String TicketID;
    public String SeatNumber;
    public int Price;

    public FlightPassenger(String fileLine) {
        String[] split = fileLine.split(";");
        this.FlightNumber = split[0];
        this.Source = split[1];
        this.Destination = split[2];
        this.PassengerName = split[3];
        this.PassengerId = Integer.parseInt(split[4]);
        this.TicketID = split[5];
        this.SeatNumber = split[6];
        this.Price = Integer.parseInt(split[7]);
    }
}
