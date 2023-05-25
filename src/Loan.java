package src;
public abstract class Loan implements LoanConstants {

  protected int loanNumber, termLength;
  protected double loanAmount, interestRate;
  protected String customerLastName;

  public Loan(int loanNumber, int termLength, double loanAmount, String customerLastName) {
    this.loanNumber = loanNumber;
    this.termLength = termLength;
    this.loanAmount = loanAmount;
    this.customerLastName = customerLastName;
  }

  protected double validateLoanAmount(double loanAmount) {
    if (loanAmount > LoanConstants.maxLoanAmount) {
      throw new IllegalArgumentException("Maximum loam amount is" + LoanConstants.maxLoanAmount);
    }
    return maxLoanAmount;
  }

  protected int validateTermLength(int termLength) {
    if (termLength != LoanConstants.shortTerm && termLength != LoanConstants.mediumTerm
        && termLength != LoanConstants.longTerm) {
      throw new IllegalArgumentException("Invalid loan term");
    }
    return LoanConstants.shortTerm;
  }

  @Override
  public boolean equals(Object o) {
      if(this == o) return true;
      if(o == null || getClass() != o.getClass()) return false;
      Loan loan = (Loan) o;
      return loanNumber == loan.loanNumber &&
             Double.compare(loan.loanAmount, loanAmount) == 0 &&
             Double.compare(loan.interestRate, interestRate) == 0 &&
             termLength == loan.termLength &&
             customerLastName.equals(loan.customerLastName);
  }

  @Override
  public String toString() {
    return "Loan Number: " + this.loanNumber + "\n"
        + "Loan Term: " + this.termLength + "\n"
        + "Loan Amount: " + this.loanAmount + "\n"
        + "Customer: " + this.customerLastName;
  }
}