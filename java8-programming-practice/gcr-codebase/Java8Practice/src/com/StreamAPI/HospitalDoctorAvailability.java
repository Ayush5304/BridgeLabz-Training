package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class HospitalDoctorAvailability {

    static class Doctor {
        String name;
        String specialty;
        boolean weekendAvailable;

        public Doctor(String name, String specialty, boolean weekendAvailable) {
            this.name = name;
            this.specialty = specialty;
            this.weekendAvailable = weekendAvailable;
        }

        public boolean isWeekendAvailable() {
            return weekendAvailable;
        }

        public String getSpecialty() {
            return specialty;
        }

        @Override
        public String toString() {
            return name + " | Specialty: " + specialty;
        }
    }

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Khan", "Neurology", false),
                new Doctor("Dr. Mehta", "Orthopedics", true),
                new Doctor("Dr. Verma", "Dermatology", true),
                new Doctor("Dr. Roy", "Pediatrics", false)
        );

        List<Doctor> weekendDoctors =
                doctors.stream()
                        .filter(Doctor::isWeekendAvailable)  
                        .sorted(Comparator.comparing(Doctor::getSpecialty))
                        .collect(Collectors.toList());         

        System.out.println(" Doctors Available on Weekends (Sorted by Specialty):");
        weekendDoctors.forEach(System.out::println);
    }
}
