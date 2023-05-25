package src;
public class BusinessLoan extends Loan {
    public BusinessLoan (int loanNumber, int termLength, double loanAmount, String customerLastName, double currentInterestRate){
            super(loanNumber, termLength, loanAmount, customerLastName);
            this.interestRate = 3.2 + currentInterestRate;
    }
}