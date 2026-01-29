package com.FunctionalInterfaces.StaticMethodsinInterfaces;
import java.util.regex.Pattern;

 interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        String regex =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

        return Pattern.matches(regex, password);
    }
}

public class PasswordValidatorApp {
    public static void main(String[] args) {

        String password = "Insu@1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println(" Strong Password");
        } else {
            System.out.println(" Weak Password");
        }
    }
}
