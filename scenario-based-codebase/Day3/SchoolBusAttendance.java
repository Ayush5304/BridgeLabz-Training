import java.util.Scanner;

public class SchoolBusAttendance{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {"Amit", "Ravi", "Neha", "Pooja", "Rahul", "Ankit", "Sneha", "Karan", "Priya", "Vikas" };

        int present = 0, absent = 0;

        // for-each loop for attendance
        for (String name : students) {
            System.out.print(name + " (P/A)");
            char status = sc.next().charAt(0);

            if (status == 'P' || status == 'p')
                present++;
            else
                absent++;
        }

        System.out.println("Total Present " + present);
        System.out.println("Total Absent" + absent);
    }
}
