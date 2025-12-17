import java.util.Scanner;
//program for finding a side of square//
    public class SquareSide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //parameter you read from user and take formula: (sqaure=perimeter/4) //
        System.out.print("Enter the perimeter of square ");
        double perimeter= sc.nextDouble();
		double side= perimeter/4;
		//output//
		System.out.println("The length of the side is:" + side + "whose perimeter is :"+ perimeter);
		sc.close();
	}
	}
