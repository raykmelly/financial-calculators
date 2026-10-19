package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    // Main method. Calls the methods for each calculator.
    public static void main(String[] args) {
        // Setup, the methods will all use this one scanner
        Scanner scanner = new Scanner(System.in);

        // [Calculator #1] (Mortgage calculator)
        MortgageCalculator(scanner);

        // [Calculator #2] (Future value of deposits)

    }

    // Calculates the interest and monthly payments on a mortgage.
    public static void MortgageCalculator(Scanner scanner) {
        // Requesting the principal of the loan
        System.out.println("Enter the principal of your loan: ");
        double principal = scanner.nextDouble();
        // Requesting interest rate. (Divided by 100 to make it a percent)
        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble() / 100;
        // Getting the loan length in years
        System.out.println("Enter the loan length (in years): ");
        int loanLength = scanner.nextInt();

        // Calculate the number of payments in months for the loan's length
        int monthlyPayments = loanLength * 12;
        // Calculate the interest rate in months, not years
        double monthlyInterestRate = interestRate / 12;
        // Calculate the monthly payment of the loan
        double finalMonthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,monthlyPayments));

        double interest = principal * interestRate * loanLength;

        // Display the information to the user on the terminal
        System.out.printf("[Total Interest] = %.2f%n [Monthly Payment] = %f.2f%n",interest,finalMonthlyPayment);
    }
}