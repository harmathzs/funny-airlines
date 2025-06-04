import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    }
}
