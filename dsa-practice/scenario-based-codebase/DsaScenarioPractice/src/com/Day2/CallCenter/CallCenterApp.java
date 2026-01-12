package com.Day2.CallCenter;

public class CallCenterApp {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall(new Customer("C101", false));
        center.receiveCall(new Customer("C102", true));
        center.receiveCall(new Customer("C101", false));
        center.receiveCall(new Customer("C103", true));

        center.serveCall();
        center.serveCall();

        center.displayCallCounts();
    }
}  