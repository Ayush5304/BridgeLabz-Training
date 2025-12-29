import java.util.Scanner;

public class ParkingLotGateSystem{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 5;  
        int parkedCars = 0;  
        int choice;

        // Loop runs until parking is full or user exits
        while (parkedCars < totalSlots) {

            System.out.println("Parking Lot Gate System");
            System.out.println("Park Vehicle");
            System.out.println("Exit Vehicle");
            System.out.println("Show Occupancy");
            System.out.println("Exit System");
            System.out.print("Enter your choice");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    parkedCars++;
                    System.out.println("Vehicle Parked Successfully");
                    break;

                case 2:
                    if (parkedCars > 0){
                        parkedCars--;
                        System.out.println("Vehicle Exited Successfully");
                    } else {
                        System.out.println("Parking Lot is Empty");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots" + parkedCars);
                    System.out.println("Available Slots" + (totalSlots - parkedCars));
                    break;

                case 4:
                    System.out.println("Exiting System Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again");
            }
        }

        System.out.println("Parking Lot is FULL");
    }
}
