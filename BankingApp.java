package banking;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankServer service = new BankServer();

        // Default Accounts

        BankAccount acc1 =
                new BankAccount("Rahul", 101, 5000);

        BankAccount acc2 =
                new BankAccount("Aman", 102, 8000);

        BankAccount acc3 =
                new BankAccount("Priya", 103, 10000);

        service.addAccount(acc1);
        service.addAccount(acc2);
        service.addAccount(acc3);

        int choice;

        do {

            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");

            System.out.println("1. Show All Accounts");
            System.out.println("2. Search Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                service.showAccount();

                break;

            case 2:

                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                service.searchAccount(accNo);

                break;

            case 3:

                System.out.print("Enter Account Number: ");
                int depositAcc = sc.nextInt();

                System.out.print("Enter Deposit Amount: ");
                double amount = sc.nextDouble();

                service.depositMoney(depositAcc, amount);

                break;

            case 4:

                System.out.print("Enter Account Number: ");
                int withdrawAcc = sc.nextInt();

                System.out.print("Enter Withdraw Amount: ");
                double withdrawAmount = sc.nextDouble();

                service.withdrawMoney(withdrawAcc, withdrawAmount);

                break;

            case 5:

                System.out.println(
                        "Thank You For Using Banking System!");

                break;

            default:

                System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
