import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransportType[] transportTypes = TransportType.values();
        System.out.println("Enter the distance: ");
        double distance = new Scanner(System.in).nextDouble();
        for (TransportType transportType : transportTypes) {
            System.out.println("For " + distance + "km travel whith " + transportType + " costs "+ transportType.calculateTravelCost(distance) + "$");
        }
    }
}