package com.forEachMethod;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                1250.50, 1275.75, 1300.00, 1290.25, 1315.80
        );

        System.out.println("Live Stock Prices:");

        stockPrices.stream()
                   .forEach(price -> System.out.println("Stock Price: ₹" + price));
    }
}

