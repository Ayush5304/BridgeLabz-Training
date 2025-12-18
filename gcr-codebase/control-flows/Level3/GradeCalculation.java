import java.util.Scanner ;

// a program to input marks and 3 subjects physics, chemistry and maths
public class GradeCalculation{

    public static void main(String[] args) {
	// Create Scanner object
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter marks of physics");
	   int physics= sc.nextInt();
	    System.out.println("enter marks of chemistry");
	   int chemistry= sc.nextInt();
	    System.out.println("enter marks of maths");
	   int maths= sc.nextInt();
	   
	    // Calculate total and average
        int total = physics + chemistry + maths;
        double average = total / 3.0;

	   char grade;
	   String remarks;
	   if(average>=80){
	     grade = 'A';
	   remarks="Level 4 above agency-normalized standards";
	    } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
		  System.out.println("Result");
        System.out.println("Average Marks  " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks " + remarks);
		}
		}
