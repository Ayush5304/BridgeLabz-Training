package com.AssessmentProblems.CarPro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookCabMain {

    private Map<String, Date> bookingMap;

    public Map<String, Date> getBookingMap() {
        return bookingMap;
    }

    public void setBookingMap(Map<String, Date> bookingMap) {
        this.bookingMap = bookingMap;
    }

    public List<String> findCabBookingIdsForTheBookingDate(Date date) {

        List<String> result = new ArrayList<>();

        if (bookingMap == null || bookingMap.isEmpty()) {
            return result;
        }

        for (Map.Entry<String, Date> entry : bookingMap.entrySet()) {
            if (entry.getValue().equals(date)) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
}
