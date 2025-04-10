package atm;

import java.util.Scanner;

public class Atm {
    private static final String ACCOUNT_NUMBER = "123456";
    private static String pin = "1234";
    private static int attempts = 3;
    private static double balance = 1000.00; // Example balance
    private static String phoneNumber = "9876543210"; // Example phone number
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        authenticateUser();
    }

    private static void authenticateUser() {
        while (attempts > 0) {
            System.out.println("Enter your account number: ");
            String inputAccount = scanner.nextLine();

            System.out.println("Enter your PIN: ");
            String inputPin = scanner.nextLine();

            if (ACCOUNT_NUMBER.equals(inputAccount) && pin.equals(inputPin)) {
                showOptions();
                return;
            } else {
                attempts--;
                System.out.println("Invalid credentials. Attempts left: " + attempts);
            }
        }
        System.out.println("Transaction blocked due to too many failed attempts.");
    }

    private static void showOptions() {
        System.out.println("Authentication successful. Choose an option:");
        System.out.println("1. View Balance");
        System.out.println("2. Change PIN/Password");
        System.out.println("3. Change Phone Number");
        System.out.println("4. Deposit Money");
        System.out.println("5. Withdraw Money");
        System.out.println("6. Register/Create PIN");
        System.out.println("7. Logout");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                viewBalance();
                break;
            case 2:
                changePin();
                break;
            case 3:
                changePhoneNumber();
                break;
            case 4:
                depositMoney();
                break;
            case 5:
                withdrawMoney();
                break;
            case 6:
                registerPin();
                break;
            case 7:
                logout();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                showOptions();
                break;
        }
    }

    private static void viewBalance() {
        // Implementation for viewing balance
        System.out.println("Your current balance is: ₹" + balance);
        showOptions();
    }

    private static void changePin() {
        // Implementation for changing PIN
        System.out.println("Enter new PIN: ");
        pin = scanner.nextLine();
        System.out.println("Your PIN has been changed successfully.");
        showOptions();
    }

    private static void changePhoneNumber() {
        // Implementation for changing phone number
        System.out.println("Enter new phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Your phone number has been changed successfully.");
        showOptions();
    }

    private static void depositMoney() {
        // Implementation for depositing money
        System.out.println("Enter amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        balance += amount;
        System.out.println("Money deposited successfully.");
        showOptions();
    }

    private static void withdrawMoney() {
        // Implementation for withdrawing money
        System.out.println("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
        showOptions();
    }

    private static void registerPin() {
        // Implementation for registering or creating a new PIN
        System.out.println("Enter a new PIN to register: ");
        pin = scanner.nextLine();
        System.out.println("Your new PIN has been registered successfully.");
        showOptions();
    }

    private static void logout() {
        // Implementation for logout
        System.out.println("Thank you for using our service. Goodbye!");
    }
}
