package com.Day6.LoanBuddy;

public class LoanBuddyApp {

	public static void main(String[] args) {
	Applicant applicant=new Applicant("Ayush", 700, 40000, 50000);
	 LoanApplication loan = new HomeLoan(applicant, 240);
	
    if (loan.approveLoan()) {
        System.out.println(" Loan Approved for " + applicant.getName());
        System.out.println("Loan Type: Home Loan");
        System.out.println("Monthly EMI: ₹" + Math.round(loan.calculateEMI()));
    } else {
        System.out.println(" Loan Rejected for " + applicant.getName());
    }
}
}

