package com.Day6.LoanBuddy;

public class AutoLoan extends LoanApplication{

	public AutoLoan(Applicant applicant, int term) {
	super(applicant, term, 10.0);
	this.loanType="AutoLoan";
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