package com.codewithmosh;

import java.text.NumberFormat;

public class MortgageReport { //CLASS

    private final NumberFormat currency; // weet noe wat hier aangaan nie.
    private MortgageCalculator sakrekenaar; // Renaming the Class / Function ... why?

    public MortgageReport(MortgageCalculator sakrekenaar) { //FUNCTION - did he rename MortgageCalculator to "calculator"
        this.sakrekenaar = sakrekenaar;
        currency = NumberFormat.getCurrencyInstance(); //FROM IMPORTED CLASS
    }

    public void printPaymentSchedule() { //FUNCTION
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : sakrekenaar.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void printMortgage() { //FUNCTION
        double mortgage = sakrekenaar.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}

