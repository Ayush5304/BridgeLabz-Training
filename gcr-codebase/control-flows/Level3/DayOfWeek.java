import java.util.Scanner;

//a program DayOfWeek that takes a date as input and prints the day of the week 
public class DayOfWeek {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        //  take three command-line arguments
       if (args.length!=3){
	   System.out.println("Usage java dayofweek <month> <day> <year>");
	   return ;
	   }
	    //  take three command-line arguments
		int m= Integer.parseInt(args[0]);
		int d= Integer.parseInt(args[1]);
		int y= Integer.parseInt(args[2]);
		//Apply formulas for the Gregorian calendar 
		  int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);
    }
}