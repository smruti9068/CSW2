abstract class Account {
    private int account_Number;
    private double bal;

    public Account(int account_Number, double balance) {
        this.account_Number = account_Number;
        this.bal = bal;
    }

    public int getAccountNumber() {
        return account_Number;
    }

    public double getBalance() {
        return bal;
    }

    public void deposit(double amount) {
        bal += amount;
    }

    public void withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int account_Number, double bal, double interestRate) {
        super(account_Number, bal);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        super.deposit(amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int account_Number, double bal, double overdraftLimit) {
        super(account_Number, bal);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit");
        }
    }
}

public class Banking_Application {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(123456, 1000, 5.0);
        CurrentAccount currentAccount = new CurrentAccount(654321, 2000, 1000);

        // Testing deposit and withdrawal operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);

        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
        System.out.println("Overdraft Limit: $" + currentAccount.getOverdraftLimit());
    }
}