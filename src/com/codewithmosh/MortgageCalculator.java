package com.codewithmosh;

public class MortgageCalculator { //CLASS
    private final static byte MONTHS_IN_YEAR = 12; //CONSTANT
    private final static byte PERCENT = 100; //CONSTANT

    private int principal; //VAR
    private float annualInterest; //VAR
    private byte years; //VAR

    public MortgageCalculator(int principal, float annualInterest, byte years) { //FUNCTION
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) { //FUNCTION
        float monthlyInterest = getMonthlyInterest(); //VARIABLE POPULATED FUNCTION
        float numberOfPayments = getNumberOfPayments(); //VARIABLE POPULATED WITH FUNCTION

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() { //METHOD
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double[] getRemainingBalances() { //METHOD
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private float getMonthlyInterest() { // METHOD
        return annualInterest / PERCENT / MONTHS_IN_YEAR;  //TWO CONSTANTS ABOVE
    }

    private int getNumberOfPayments() { // METHOD
        return years * MONTHS_IN_YEAR;
    }
}

