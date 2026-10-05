package banking;

import java.util.ArrayList;

public class BankServer {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {

        accounts.add(account);

        System.out.println("Account Added Successfully!");
    }

    public void showAccount() {

        System.out.println("======= ALL BANK ACCOUNTS =======");

        for (BankAccount account : accounts) {

            System.out.println("Account Holder: "
                    + account.getAccountHolder());

            System.out.println("Account Number: "
                    + account.getAccountNumber());

            System.out.println("Balance: "
                    + account.getBalance());

            System.out.println("--------------------------------");
        }
    }

    public void searchAccount(int accountNumber) {

        boolean found = false;

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                System.out.println("Account Found!");

                System.out.println("Account Holder: "
                        + account.getAccountHolder());

                System.out.println("Account Number: "
                        + account.getAccountNumber());

                System.out.println("Balance: "
                        + account.getBalance());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account Not Found!");
        }
    }

    public void depositMoney(int accountNumber, double amount) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                account.deposit(amount);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    public void withdrawMoney(int accountNumber, double amount) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber() == accountNumber) {

                account.withdraw(amount);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }
}
