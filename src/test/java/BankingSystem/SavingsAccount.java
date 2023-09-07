package BankingSystem;

public class SavingsAccount extends Account {

        private double interestRate;

        public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
            super(accountNumber, initialBalance);
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            deposit(interest);
            System.out.println("Interest of $" + interest + " applied to Savings Account " + getAccountNumber());
        }
    }


