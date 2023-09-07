package BankingSystem;

public class BankingSystemMain {


    public static void main(String[] args) {
        // Create a Checking Account
        CheckingAccount checkingAccount = new CheckingAccount("C12345", 1000.0, 500.0);

        // Create a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("S67890", 2000.0, 2.5);

        // Deposit and withdraw from accounts
        checkingAccount.deposit(200.0);
        checkingAccount.withdraw(1500.0);
        checkingAccount.displayBalance();

        savingsAccount.deposit(500.0);
        savingsAccount.applyInterest();
        savingsAccount.displayBalance();
    }
}


