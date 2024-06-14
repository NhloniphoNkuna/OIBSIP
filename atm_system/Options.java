/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_system;

/**
 *
 * @author nkuna
 */
import java.util.Scanner;

class Options {
    private ATM atm;
    private Scanner scanner;

    public Options(ATM atm) {
        this.atm = atm;
        scanner = new Scanner(System.in);
    }

    public void start() {
        try {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            Account account = atm.getAccount(accountNumber);

            if (account != null && account.checkPin(pin)) {
                showMenu(account);
            } else {
                System.out.println("Invalid account number or PIN.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during login. Please try again.");
        }
    }

    private void showMenu(Account account) {
        while (true) {
            try {
                System.out.println("ATM Interface:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Transaction History");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is: $" + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawalAmount);
                        break;
                    case 4:
                        account.showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }
}
