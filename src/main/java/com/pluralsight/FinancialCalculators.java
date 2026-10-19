package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    // Main method. Calls the methods for each calculator.
    public static void main(String[] args) {
        // Setup, the methods will all use this one scanner
        Scanner scanner = new Scanner(System.in);

        // [Calculator #1] (Mortgage calculator)

        // Prompting the principal of the loan
        System.out.println("Enter the principal of your loan: ");
        double principal = scanner.nextDouble();
        // Prompting interest rate. (Divided by 100 to make it a percent)
        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble() / 100;
        // Prompting the loan length in years
        System.out.println("Enter the loan length (in years): ");
        double loanLength = scanner.nextInt();

        // Call the MortgageCalculator method and print the: Monthly payments & Total interest
        MortgageCalculator(principal,interestRate,loanLength);

        // [Calculator #2] (Future value of deposits)

        // Prompting for the deposit
        // Prompting for the annual interest rate
        // Prompting for the loan length

        // Close the scanner when we're done with it
        scanner.close();
    }

    // Calculates the interest and monthly payments on a mortgage.
    public static void MortgageCalculator(double principal, double interestRate, double loanLength) {
        // Calculate the number of payments in months for the loan's length
        double totalMonths = loanLength * 12;
        // Calculate the interest rate in months, not years
        double monthlyRate = interestRate / 12;
        // Calculate the monthly payment of the loan
        // M = P × (i × (1 + i)^n) / ((1 + i)^n - 1)
        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, totalMonths))
                / (Math.pow(1 + monthlyRate, totalMonths) - 1);

        // Calculate the total interest (TotalPayment - Original Principal)10
        double totalInterest = (monthlyPayment * totalMonths) - principal;

        // Display the information to the user on the terminal
        System.out.printf("   [Total Interest] = %.2f%n   [Monthly Payment] = %.2f%n",totalInterest,monthlyPayment);
    }

    // Calculate the future interest of a one time deposit.
    public static void CalculateFutureInterest(double deposit, double annualInterestRate, double years) {

    }
}