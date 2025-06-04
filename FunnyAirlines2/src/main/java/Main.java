import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static List<FlightPassenger> flightPassengerList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        // 1. feladat
        flightPassengerList = new ArrayList<>();
        File fin = new File("funny-airlines.csv");
        Scanner scanner = new Scanner(fin);
        String firstLine = scanner.nextLine();
        while (scanner.hasNextLine()) {
            String fileLine = scanner.nextLine();
            flightPassengerList.add(new FlightPassenger(fileLine));
        }
        System.out.println("1. Adatok beolvasva.");

        // 2. feladat
        System.out.println("2. Különböző járatok száma: "+flightPassengerList.size());

        // 3. feladat
        // megoldás HashSet-tel:
        Set<Integer> passengerIds = new HashSet<>();
        for (FlightPassenger flightPassenger: flightPassengerList) {
            passengerIds.add(flightPassenger.PassengerId);
        }
        System.out.println("3. Egyedi utasok száma: "+passengerIds.size());

        // 4. feladat
        int sumOfJegyek = 0;
        for (FlightPassenger flightPassenger: flightPassengerList) {
            sumOfJegyek += flightPassenger.Price;
        }
        System.out.println("4. Jegyek összértéke: "+sumOfJegyek+" Ft");

        // 5. feladat
        FlightPassenger legdragabb = flightPassengerList.get(0);
        for (int i=1; i< flightPassengerList.size(); i++) {
            if (flightPassengerList.get(i).Price > legdragabb.Price) {
                legdragabb = flightPassengerList.get(i);
            }
        }
        System.out.println("5. Legdrágább jegy:");
        System.out.println("Utas neve: "+legdragabb.PassengerName);
        System.out.println("Utas azonosító: "+legdragabb.PassengerId);
        System.out.println("Járatszám: "+legdragabb.FlightNumber);
        System.out.println("Ár: "+legdragabb.Price+" Ft");

        // 6. feladat
        List<FlightPassenger> bpre = new ArrayList<>();
        for (FlightPassenger flightPassenger: flightPassengerList) {
            if (Objects.equals(flightPassenger.Destination, "Budapest")) {
                bpre.add(flightPassenger);
            }
        }
        System.out.println("6. Budapestre tartó járatok:");
        for (FlightPassenger flightPassenger: bpre) {
            System.out.println(
                    "FlightNumber: "+flightPassenger.FlightNumber+
                    ", Source: "+flightPassenger.Source+
                    ", Passenger: "+flightPassenger.PassengerName+
                    ", PassengerId: "+flightPassenger.PassengerId+
                    ", Price: "+flightPassenger.Price+" HUF");
        }

        // 7. feladat
        double avg = 1.0* sumOfJegyek / flightPassengerList.size();
        System.out.println("7. Jegyek átlagára: "+Math.round(avg)+" Ft");
    }
}
