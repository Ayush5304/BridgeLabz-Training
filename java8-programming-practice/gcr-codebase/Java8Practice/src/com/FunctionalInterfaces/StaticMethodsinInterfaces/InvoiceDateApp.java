package com.FunctionalInterfaces.StaticMethodsinInterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

 interface DateFormatterUtil {

    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class InvoiceDateApp {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("DD-MM-YYYY : " +
                DateFormatterUtil.format(today, "dd-MM-yyyy"));

        System.out.println("YYYY/MM/DD : " +
                DateFormatterUtil.format(today, "yyyy/MM/dd"));

        System.out.println("Full Date  : " +
                DateFormatterUtil.format(today, "EEEE, dd MMM yyyy"));
    }
}
