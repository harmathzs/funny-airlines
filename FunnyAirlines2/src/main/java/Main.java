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
    }
}
