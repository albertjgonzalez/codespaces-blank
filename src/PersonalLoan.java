package src;
public class PersonalLoan extends Loan {
    public PersonalLoan (int loanNumber, int termLength, double loanAmount, String customerLastName, double currentInterestRate){
        super(loanNumber, termLength, loanAmount, customerLastName);
        this.interestRate = 2.7 + currentInterestRate;
}
}