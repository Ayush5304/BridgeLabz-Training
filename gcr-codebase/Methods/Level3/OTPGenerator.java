import java.util.Arrays;

public class OTPGenerator{

    public static void main(String[] args) {

        // Array to store 10 OTP numbers
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs");
        System.out.println(Arrays.toString(otpArray));

        // Check uniqueness
        boolean isUnique = checkUniqueOTPs(otpArray);
        System.out.println("Are all OTPs unique " + isUnique);
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP(){
        // Generates number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean checkUniqueOTPs(int[] otps) {

        // Compare each OTP with every other OTP
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }
}
