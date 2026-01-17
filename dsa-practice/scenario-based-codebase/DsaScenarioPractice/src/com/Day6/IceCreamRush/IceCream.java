package com.Day6.IceCreamRush;

public class IceCream {
    String flavor;
    int sales;

    public IceCream(String flavor, int sales) {
        this.flavor = flavor;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return flavor + " (" + sales + ")";
    }
}
