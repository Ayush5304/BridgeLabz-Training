package com.Day3.CabbyGo;
interface IRideService {
    void bookRide(Vehicle vehicle, Driver driver, double distance);
    void endRide();
}
