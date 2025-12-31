import java.util.Scanner;

public class BusRouteDistanceTracker{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        int stop = 1;

        while (true) {
            System.out.print("Enter distance covered at stop " + stop + " (in km): ");
            int distance = sc.nextInt();

            totalDistance += distance;

            System.out.println("Total distance so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }

            stop++;
        }

        System.out.println("Journey ended");
        System.out.println("Total distance travelled: " + totalDistance + " km");

        sc.close();
    }
}
