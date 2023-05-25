package src;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Loan[] loans = new Loan[5];
        Scanner scanner = new Scanner(System.in);
        double currentInterestRate = 0.0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter the current prime interest rate:");
                  currentInterestRate = scanner.nextDouble();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number for the prime interest rate.");
                scanner.next();
            }
        }

        for(int i=0; i<loans.length; i++) {
            System.out.println("Enter the loan type (personal or business):");
            String loanType = scanner.next().toLowerCase();

            int loanNumber = 0;
            String customerLastName = "";
            double loanAmount = 0.0;
            int termLength = 0;

            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter the loan number:");
                    loanNumber = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number for the loan number.");
                    scanner.next();
                }
            }

            System.out.println("Enter the customer last name:");
            customerLastName = scanner.next();

            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter the amount of loan:");
                    loanAmount = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number for the loan amount.");
                    scanner.next();
                }
            }

            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter the term of loan:");
                    termLength = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number for the term of loan.");
                    scanner.next();
                }
            }

            if (loanType.equals("personal")) {
                loans[i] = new PersonalLoan(loanNumber, termLength, loanAmount, customerLastName, currentInterestRate);
            } else if (loanType.equals("business")) {
                loans[i] = new BusinessLoan(loanNumber,  termLength, loanAmount, customerLastName, currentInterestRate);
            } else {
                System.out.println("Invalid loan type entered. Please enter either personal or business.");
                i--;
            }
        }

        for(Loan loan : loans) {
            System.out.println(loan.toString());
        }
    }
}
