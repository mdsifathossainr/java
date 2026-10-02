// Problem 5: Write a Java program to create a class known as "BankAccount" with methods called
// deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
// withdraw() method to prevent withdrawals if the account balance falls below one
// hundred.

class BankAccount {

    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit : " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw : " + amount);
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void withdraw(double amount) {

        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        } else {
            System.out.println("Withdrawal denied");
        }
    }
}

public class Problem5 {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Balance : " + account.balance);
    }
}