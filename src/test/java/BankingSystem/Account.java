package BankingSystem;

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: $" + balance);

    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Getter method for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
}




