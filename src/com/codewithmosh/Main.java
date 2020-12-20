package com.codewithmosh;

public class Main { //CLASS

    public static void main(String[] args) { //METHOD
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000); //METHOD BEING CALLED FROM THE CONSOLE CLASS
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30); //METHOD BEING CALLED FROM THE CONSOLE CLASS
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30); //METHOD BEING CALLED FROM THE CONSOLE CLASS
        // THE ABOVE "PROMPT", "MIN" AND "MAX" ARE BEING USED BY Console's readNumber method.

        var calculator = new MortgageCalculator(principal, annualInterest, years); //CALLING ANOTHER CLASS

        var report = new MortgageReport(calculator); //CALLING ANOTHER CLASS
        report.printMortgage();
        report.printPaymentSchedule();
    }

}

