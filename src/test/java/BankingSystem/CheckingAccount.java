package BankingSystem;

public class CheckingAccount extends Account {

        private double overdraftLimit;

        public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
            super(accountNumber, initialBalance);
            this.overdraftLimit = overdraftLimit;
        }
        @Override
        public void withdraw(double amount) {
            if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawn $" + amount + " from Checking Account " + getAccountNumber());
            } else {
                System.out.println("Withdrawal of $" + amount + " from Checking Account " + getAccountNumber() + " not allowed.");
            }
        }
    }


