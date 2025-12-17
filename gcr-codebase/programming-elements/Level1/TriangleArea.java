import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take Input from users//
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        //  Area of traingle calculation//
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;

        // Output//
        System.out.println( "The area of the triangle in square inches is " + areaInSqInches +
            " and in square centimeters is " + areaInSqCm );

        sc.close();
    }
}
