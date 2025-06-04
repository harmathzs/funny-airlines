import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FunnyAirlinesTest {
    @BeforeClass
    public static void testBeforeAll() {
        Main.isRunningTest = true;
    }


    @Test
    public void testGipszJakab() throws FileNotFoundException {
        Main.testInputPassengerName = "Gipsz Jakab";
        Main.main(null);
        Assert.assertEquals("Gipsz Jakab", Main.testInputPassengerName);
    }

    @Test
    public void testJaneSmith() throws FileNotFoundException {
        Main.testInputPassengerName = "Jane Smith";
        Main.main(null);

        Assert.assertNotNull(Main.flightPassengerList);
        Assert.assertNotEquals(0, Main.flightPassengerList.size());

        FlightPassenger flightPassenger0 = Main.flightPassengerList.get(0);
        Assert.assertNotNull(flightPassenger0);
        Assert.assertNotNull(flightPassenger0.FlightNumber);
        Assert.assertNotNull(flightPassenger0.PassengerName);
        Assert.assertNotNull(flightPassenger0.PassengerId);
        Assert.assertNotNull(flightPassenger0.Destination);
        Assert.assertNotNull(flightPassenger0.Source);
        Assert.assertNotNull(flightPassenger0.SeatNumber);
        Assert.assertNotNull(flightPassenger0.TicketID);
        Assert.assertNotNull(flightPassenger0.Price);
    }

    @Test
    public void testMickeyMouse() throws FileNotFoundException {
        Main.testInputPassengerName = "Mickey Mouse";
        Main.main(null);

        Assert.assertNotNull(Main.flightPassengerList);
        Assert.assertNotEquals(0, Main.flightPassengerList.size());

        FlightPassenger flightPassenger0 = Main.flightPassengerList.get(0);
        Assert.assertNotNull(flightPassenger0);
        Assert.assertNotNull(flightPassenger0.FlightNumber);
        Assert.assertNotNull(flightPassenger0.PassengerName);
        Assert.assertNotNull(flightPassenger0.PassengerId);
        Assert.assertNotNull(flightPassenger0.Destination);
        Assert.assertNotNull(flightPassenger0.Source);
        Assert.assertNotNull(flightPassenger0.SeatNumber);
        Assert.assertNotNull(flightPassenger0.TicketID);
        Assert.assertNotNull(flightPassenger0.Price);

        FlightPassenger flightPassenger1 = Main.flightPassengerList.get(1);
        Assert.assertNotNull(flightPassenger1);
        Assert.assertNotNull(flightPassenger1.FlightNumber);
        Assert.assertNotNull(flightPassenger1.PassengerName);
        Assert.assertNotNull(flightPassenger1.PassengerId);
        Assert.assertNotNull(flightPassenger1.Destination);
        Assert.assertNotNull(flightPassenger1.Source);
        Assert.assertNotNull(flightPassenger1.SeatNumber);
        Assert.assertNotNull(flightPassenger1.TicketID);
        Assert.assertNotNull(flightPassenger1.Price);
    }


    @AfterClass
    public static void testAfterAll() {
        Main.isRunningTest = false;
    }
}
