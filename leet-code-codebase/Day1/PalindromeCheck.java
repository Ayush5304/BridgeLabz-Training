//leetcode(9)- palindrome check
import java.util.Scanner;

class PalindromeCheck{
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

public static void main(String[] args){
Scanner sc= new Scanner(System.in);

   System.out.println("enter the number");
   int x=sc.nextInt();
   
   if (isPalindrome(x)){
   System.out.println("palindrome");
   }
   else{
   System.out.println("not palindrome");
   }
   }
   }