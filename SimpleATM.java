import java.util.*;

public class SimpleATM {

    static Scanner sc = new Scanner(System.in);
    static double balance = 5000;
    static int pin = 1234;
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Welcome to ATM ===");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong PIN. Access Denied!");
            return;
        }

        System.out.println("Login Successful!");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                balance += amount;
                history.add("Deposited: " + amount);
                System.out.println("Deposit Successful!");
            } else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    history.add("Withdrawn: " + amount);
                    System.out.println("Please collect cash!");
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else if (choice == 4) {
                System.out.println("--- Transaction History ---");
                if (history.isEmpty()) {
                    System.out.println("No transactions yet.");
                } else {
                    for (String t : history) {
                        System.out.println(t);
                    }
                }
            } else if (choice == 5) {
                System.out.println("Thank you for using ATM!");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}