package com.Day6.LoanBuddy;

public class Applicant {
    protected String name;
    private int creditScore;
    protected double income;
    protected double loanAmount; 
    
    public Applicant(String name,  int creditScore, double income, double loanAmount) {
		this.name=name;
		this.creditScore=creditScore;
		this.income=income;
		this.loanAmount=loanAmount;
	}
    public String getName(){
        return name;
        }
    public int getCreditScore(){
        return creditScore;
        }
    public double getIncome(){
        return income;
        }
    
    public double getLoanAmount(){
    return loanAmount;
    }
}
