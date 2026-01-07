package com.Day6.LoanBuddy;

abstract class LoanApplication implements IApprovable {
     protected String loanType;
     protected int term;
     protected double interestRate;
     
     private boolean approved;
     protected Applicant applicant;
      
	public LoanApplication(Applicant applicant,  int term, double interestRate ) {
		this.applicant=applicant;
		this.term=term;
		this.interestRate=interestRate;
		this.approved=false;
	}
	public void setApproved(boolean status) {
		this.approved=status;
	}
	 public boolean isApproved() {
	        return approved;
	    }
	 
    protected double calculateEMI(double Principal, double Rate, int Months) {
    	double R= Rate / (12 * 100);
    	 double N = Months;
    	return (Principal * R * Math.pow(1 + R, N)) /(Math.pow(1 + R, N) - 1);
}
}
