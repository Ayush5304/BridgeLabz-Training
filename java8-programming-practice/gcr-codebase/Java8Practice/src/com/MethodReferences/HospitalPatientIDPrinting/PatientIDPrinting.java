package com.MethodReferences.HospitalPatientIDPrinting;

import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {

        List<Integer> patientIds = List.of(101, 102, 103, 104, 105);

        patientIds.forEach(System.out::println);
    }
}
