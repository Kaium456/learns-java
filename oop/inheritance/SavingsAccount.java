package oop.inheritance;

public class SavingsAccount extends CheckingAccount {
    private final double interestRate;

    public SavingsAccount(int initialBalance, String accountNumber, double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }
}
