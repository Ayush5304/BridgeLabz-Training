package com.Day6.LoanBuddy;

public class HomeLoan extends LoanApplication{

	public HomeLoan(Applicant applicant, int term) {
	super(applicant, term, 8.5);
	this.loanType="HomeLoan";
	}
	 @Override
	    public boolean approveLoan() {
	        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
	            setApproved(true);
	        }
	        return isApproved();
	    }
	 @Override
	    public double calculateEMI() {
	        return calculateEMI(applicant.getLoanAmount(),interestRate, term);
	    }
	}