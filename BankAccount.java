package banking;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;

            System.out.println("Deposit Successful!");
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0) {

            if (amount <= balance) {
                balance = balance - amount;

                System.out.println("Withdraw Successful!");
                System.out.println("Withdraw Amount: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }

        } else {
            System.out.println("Invalid Withdraw Amount!");
        }
    }
}
