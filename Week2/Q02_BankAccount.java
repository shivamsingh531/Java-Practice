class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Q02_BankAccount {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.balance = 5000;

        account.displayBalance();

        account.deposit(2000);
        account.displayBalance();

        account.withdraw(1500);
        account.displayBalance();
    }
}